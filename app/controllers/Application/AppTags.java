package controllers.Application;

//import models.User.Customer;

import controllers.Application.AppTags.AppCookie.UserType;
import controllers.User.routes;
import play.Logger;
import play.data.Form;
import play.data.FormFactory;
import play.mvc.Http;
import play.mvc.Result;

import javax.inject.Inject;
import java.util.HashMap;
import java.util.Optional;


import static play.mvc.Results.ok;
import static play.mvc.Results.redirect;

/**
 * Created by cybex on 2017/07/16.
 */
public class AppTags {

    public enum General {

        SITENAME("EatAloT"),
        SITEURL("https://localhost/"),
        SITEURL_TEST("http://localhost:8080/"),
        SITEDOMAIN("localhost"),

        ENABLETIME("ENABLETIME");

        private String string;

        General(String s) {
            this.string = s;
        }

        @Override
        public String toString() {
            return string;
        }
    }

    public enum FlashCodes {
        warning("warning"),
        danger("danger"),
        success("success"),
        info("info");

        private String value;

        FlashCodes(String input) {
            value = input;
        }

        @Override
        public String toString() {
            return value;
        }
    }

    public enum AppCookie {
        Org("Org"),
        RememberMe("RememberMe"),
        user_id("UserID"),
        user_type("userType"),
        user_token("userToken"),
        newUser("newUser"),
        loginTime("loginTime");

        private String value;

        AppCookie(String s) {
            value = s;
        }

        @Override
        public String toString() {
            return value;
        }

        public static String extractString(Http.Request request, AppCookie cookieString) {
            String extract = extract(request, cookieString);
            return (extract != null) ? extract : "";
        }

        public static String extract(Http.Request request, AppCookie cookieString) {
            try {
                String item = null;
                if (request.cookie(cookieString.toString()) != null)
                    item = request.cookie(cookieString.toString()).value();
                return item;
            } catch (Exception x) {
                return null;
            }
        }

        public static void clear(Http.Response response, AppCookie... cookieNames) {
            for (AppCookie cookie : cookieNames) {
                response.discardCookie(cookie.toString());
            }
        }

        public static Long extractUserId(Http.Request request) {
            String extract = extract(request, user_id);
            try {
                return Long.parseLong(extract);
            } catch (Exception x) {
                return Long.parseLong("-1");
            }
        }

        /**
         * Browser does not remove cookies, so we replace them with expired, no value cookies
         *
         * @param result
         */
        public static void logout(Result result) {
            result.withCookies(
                    buildExpiredCookie(AppCookie.RememberMe.toString()),
                    buildExpiredCookie(AppCookie.user_type.toString()),
                    buildExpiredCookie(AppCookie.user_id.toString()),
                    buildExpiredCookie(AppCookie.user_token.toString())
            );
        }

        public enum UserType {
            CUSTOMER("CUSTOMER"),
            DELIVERY("DELIVERY"),
            KITCHEN("KITCHEN");

            private String value;

            UserType(String staff) {
                value = staff;
            }

            public static UserType parse(String value) {
                switch (value) {
                    case "DELIVERY":
                        return DELIVERY;
                    case "KITCHEN":
                        return KITCHEN;
                    case "CUSTOMER":
                        return CUSTOMER;
                    default:
                        return null;
                }
            }
        }

        public static Http.Cookie buildCookie(String id, String value) {
            return new Http.Cookie(id, value, 2678400, "/", General.SITEDOMAIN.toString(), false, false, Http.Cookie.SameSite.LAX);
        }

        public static Http.Cookie buildExpiredCookie(String id) {
            return new Http.Cookie(id, "", -1, "", General.SITEDOMAIN.toString(), false, false, Http.Cookie.SameSite.LAX);
        }
    }

    public static class Session {

        public static boolean isValidUser(Http.Session session) {
            return (session.containsKey(User.token.toString()) &&
                    session.containsKey(User.id.toString()));
        }

        public static boolean isCustomer(Http.Session session) {
            return (session.get(AppCookie.user_type.toString()).equals(UserType.CUSTOMER.toString()) &&
                    session.containsKey(User.name.toString()));
        }


        public enum User {
            email("email"),
            id("id"),
            name("name"),
            surname("surname"),
            token("token");


            private String value;

            User(String input) {
                value = input;
            }

            // TODO: 2017/08/14 Check for duplicate session values, incomplete values, null values

            /**
             * Saves a user's session, values of the user saved are:
             * <ul>
             * <li>email</li>
             * <li>name</li>
             * <li>surname</li>
             * <li>id</li>
             * </ul>
             *
             * @param session
             * @param user
             * @return
             */
            public static void save(Http.Session session, models.User.User user) {
                session.put(email.value, user.getEmail());
                session.put(name.value, user.getName());
                session.put(id.value, String.valueOf(user.getUserId()));
                session.put(surname.value, user.getSurname());
            }

            // TODO: 2017/08/14 Check for duplicate session values, incomplete values, null values

            /**
             * Clears a user's session
             *
             * @param session
             * @return
             */
            public static Http.Session clear(Http.Session session) {
                Http.Session currentSession = session;
                currentSession.remove(email.value);
                currentSession.remove(id.value);
                currentSession.remove(name.value);
                currentSession.remove(surname.value);
                return currentSession;
            }

            public enum Customer {

                verified("verified"),
                isStudent("isStudent");

                private String value;

                Customer(String value) {
                    this.value = value;
                }

                /**
                 * Saves a user's session, saves values:
                 * <ul>
                 * <li>isStudent</li>
                 * </ul>
                 *
                 * @param session
                 * @param customer
                 * @return
                 */
                private static void save(Http.Session session, models.User.Customer customer) {
                    User.save(session, customer);
                    session.put(isStudent.value, String.valueOf(customer.isStudent()));
                    session.put(verified.value, String.valueOf(customer.isVerified()));
                }

                /**
                 * Clears a user's session
                 *
                 * @param session
                 * @return
                 */
                public static Http.Session clear(Http.Session session) {
                    session = User.clear(session);
                    session.remove(verified.value);
                    session.remove(isStudent.value);
                    return session;
                }

                public static String extract(Http.Session session, String id) {
                    if (session.containsKey(id))
                        return session.get(id);
                    return null;
                }

                public static void load(Http.Session session, String userId, String token) {
                    try {
                        models.User.Customer c = models.User.Customer.find.byId(userId);
                        if (c.getToken().equals(token) && c.isComplete()) {
                            save(session, c);
                            session.put(AppCookie.user_type.toString(), UserType.CUSTOMER.toString());
                        }
                    } catch (Exception x) {
                        Logger.warn(x.toString());
                    }
                }
            }

            public enum Kitchen {
                ;

                public static String extract(Http.Session session, String id) {
                    if (session.containsKey(id))
                        return session.get(id);
                    return null;
                }

                public static void load(Http.Session session, String userId, String token) {
                    try {
                        models.User.Staff s = models.User.Staff.find.byId(userId);
                        if (s.getToken().equals(token)) {
                            save(session, s);
                            session.put(AppCookie.user_type.toString(), UserType.KITCHEN.toString());
                        }
                    } catch (Exception x) {
                        Logger.warn(x.toString());
                    }
                }
            }

            public enum Delivery {
                ;

                public static String extract(Http.Session session, String id) {
                    if (session.containsKey(id))
                        return session.get(id);
                    return null;
                }

                public static void load(Http.Session session, String userId, String token) {
                    try {
                        models.User.Staff s = models.User.Staff.find.byId(userId);
                        if (s.getToken().equals(token)) {
                            save(session, s);
                            session.put(AppCookie.user_type.toString(), UserType.DELIVERY.toString());
                        }
                    } catch (Exception x) {
                        Logger.warn(x.toString());
                    }
                }
            }

//            public static class Staff {
//                public enum Delivery {
//                    ;
//
//                    public static void load(Http.Session session, String userId, String token) {
//                        try {
//                            Long id = Long.parseLong(userId);
//                            models.User.Staff staff = models.User.Staff.find.byId(id);
//                            if (staff.getToken().equals(token))
//                                save(session, c);
//                        } catch (Exception x) {
//                            Logger.warn(x.toString());
//                        }
//                    }
//                }
//            }
        }

        public enum SessionTags {
            csrfTokenString("csrfToken");

            private String value;

            SessionTags(String input) {
                value = input;
            }

            @Override
            public String toString() {
                return value;
            }
        }

        public static Result checkExistingLogin(Http.Request request, Http.Session session) {
            boolean sessionExists = checkExistingSession(session);
            return (sessionExists)
                    ? loadSessionAndRedirectUser(session)
                    : loadSessionfromCookies(request, session);
        }

        private static Result loadSessionAndRedirectUser(Http.Session session) {
            Result result = null;
            String userId = session.get(User.id.toString()),
                    token = session.get(User.token.toString());
            if (userId == null || token == null || userId.isEmpty() || token.isEmpty()) {
                session.clear();
                return result;
            }
            try {
                String s = session.get(AppCookie.user_type.toString());
                switch (AppCookie.UserType.parse(s)) {
                    case CUSTOMER: {
                        User.Customer.load(session, userId, token);
                        result = redirect(controllers.User.routes.CustomerController.index());
                        break;
                    }
                    case KITCHEN: {
                        User.Kitchen.load(session, userId, token);
                        result = redirect(controllers.Order.routes.KitchenController.index());
                        break;
                    }
                    case DELIVERY: {
                        User.Delivery.load(session, userId, token);
                        result = redirect(controllers.Delivery.routes.DeliveryController.index());
                        break;
                    }
                }
            } catch (Exception x) {
                Logger.warn("AppTags::loadSessionAndRedirectUser\n" + x.toString());
            }
            return result;
        }

        public static boolean checkExistingSession(Http.Session session) {
            String s = session.get(User.id.toString());
            return (!(s == null || s.isEmpty()));
        }

        public static Result loadSessionfromCookies(Http.Request request, Http.Session session) {
            try {
                String org = AppCookie.extract(request, AppCookie.Org);
                if (org == null)
                    return null;
                if (!org.equals(General.SITENAME.toString()))
                    return null;
                String userId = AppCookie.extractString(request, AppCookie.user_id),
                        token = AppCookie.extractString(request, AppCookie.user_token),
                        type = AppCookie.extractString(request, AppCookie.user_type);
                session.put(User.id.toString(), userId);
                session.put(User.token.toString(), token);
                session.put(AppCookie.user_type.toString(), type);

            } catch (Exception x) {
                Logger.debug(x.toString());
                return renderDefaultPage();
            }
            return loadSessionAndRedirectUser(session);
        }
    }

    public static class Database {
        public static class User {
            public static final String userId = "user_id",
                    name = "name",
                    surname = "surname",
                    password = "password",
                    email = "email",
                    cellNumber = "cell_number";
        }

        public static class Staff {
            public static final String isKitchenStaff = "is_kitchen_staff",
                    tableName = "staff";
        }

        public static class Customer {
            public static final String addressId = "address_id",
                    isStudent = "is_student",
                    emailVerified = "email_verified",
                    token = "token",
                    tableName = "customer";
        }

        public static class Address {
            public static final String addressId = "address_id",
                    unitNumber = "unit_number",
                    streetName = "street_name",
                    communityName = "community_name",
                    isCommunity = "is_community",
                    tableName = "address";
        }

        public static class Order {

            public static class OrderSchedule {
                public final static String tableName = "order_schedule";
            }

            public static class QueueType {
                public final static String tableName = "queue_type",
                        typeId = "type_id",
                        type = "type",
                        description = "description";
            }
        }

        public static class Finance {
            public static class Payment {
                public final static String tableName = "payment",
                        paymentId = "payment_id",
                        date = "date",
                        time = "time",
                        amount = "amount",
                        isCash = "is_cash";
            }
        }
    }

    public static class AppForms {

        public static String extractField(Form form, String fieldName) {
            Form.Field field = form.field(fieldName);
            Optional<String> value = field.getValue();
            return (value.isPresent())
                    ? form.field(fieldName).getValue().get()
                    : null;
        }

        public static Boolean extractFieldAsBoolean(Form form, String fieldName, String boolMatchtring) {
            String res = extractField(form, fieldName);
            if (res != null)
                return res.equals(boolMatchtring);
            return false;
        }

        public static boolean validate(String... fields) {
            for (String s : fields) {
                if (s == null || s.isEmpty())
                    return false;
            }
            return true;
        }
    }

    public static Result renderDefaultPage() {
        Result redirect = redirect(controllers.User.routes.UserController.login());
        return redirect;
    }

    public static class Locale {


        public enum Currency {
            ZAR("R"),
            USD("$");

            private String symbol;

            Currency(String symbol) {
                this.symbol = symbol;
            }

            @Override
            public String toString() {
                return symbol;
            }
        }
    }
}


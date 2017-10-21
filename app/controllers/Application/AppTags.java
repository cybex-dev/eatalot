package controllers.Application;

//import models.User.Customer.Customer;

import controllers.Application.AppTags.AppCookie.UserType;
import play.mvc.Http;
import play.mvc.Result;

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
        org("org"),
        
        user_id("UserID"),
        user_type("userType"),
        user_token("userToken"),
        
        new_user("new_user"),
        
        login_time("login_time"),

        remember_me("remember_me"),
        remember_me_true("true"),
        remember_me_false("false");

        private String value;

        AppCookie(String s) {
            value = s;
        }

        @Override
        public String toString() {
            return value;
        }

        public enum UserType {
            CUSTOMER("CUSTOMER"),
            DELIVERY("DELIVERY"),
            KITCHEN("KITCHEN"),
            ADMIN("ADMIN");

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

    public enum Routes {
        ScheduleJSRoutes("scheduleJSRoutes"),
        CustomerJSRoutes("customerJSRoutes"),
        DeliveryJSRoutes("deliveryJSRoutes"),
        FinanceJSRoutes("financeJSRoutes"),
        KitchenJSRoutes("kitchenJSRoutes"),
        AdminJSRoutes("adminJSRoutes");

        String name;

        Routes(String routesName) {
            name = routesName;
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

            public enum Customer {

                verified("verified"),
                isStudent("isStudent");

                private String value;

                Customer(String value) {
                    this.value = value;
                }
            }
        }

        public enum SessionTags {
            csrfTokenString("csrfToken"),
            visited("visited"),
            userProfile("userProfile"),
            valid("valid"),
            invalid("invalid"),
            session_status("session_status"),
			display_name("display_name"),
            admin("admin");

            private String value;

            SessionTags(String input) {
                value = input;
            }

            @Override
            public String toString() {
                return value;
            }
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


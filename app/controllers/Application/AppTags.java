package controllers.Application;

import play.mvc.Http.Session;
import play.mvc.Http;

/**
 * Created by cybex on 2017/07/16.
 */
public class AppTags {

    public enum General {

        SITENAME("EatAloT"),
        SITEURL("https://localhost/"),
        SITEDOMAIN("localhost");

        private String string;

        General(String s) {
            this.string = s;
        }

        @Override
        public String toString() {
            return string;
        }
    }

    public enum ErrorCodes {
        warning("warning"),
        danger("danger"),
        success("success"),
        info("info");

        private String value;

        ErrorCodes(String input) {
            value = input;
        }
    }

    public static class Session {

        public enum User {
            email("email"),
            id("id"),
            verified("verified"),
            name("name");

            private String value;

            User(String input) {
                value = input;
            }

            public static Http.Session save(Http.Session session, models.User.User user, Boolean remember) {
                Http.Session currentSession = session;
                currentSession.put("email", user.getEmail());
                currentSession.put("id", user.getUserId());
                currentSession.put("name", user.getName());
                currentSession.put("verified", user.getEmailVerified().toString());
                currentSession.put("remember", remember.toString());
                return currentSession;
            }

            public static Http.Session clear(Http.Session session) {
                Http.Session currentSession = session;
                currentSession.remove("email");
                currentSession.remove("id");
                currentSession.remove("name");
                currentSession.remove("verified");
                currentSession.remove("remember");
                return currentSession;
            }
        }
    }
}

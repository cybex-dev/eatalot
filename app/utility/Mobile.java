package utility;


import play.mvc.Http;

/**
 * Created by dylan on 2017/10/22.
 */
public class Mobile {
    public static boolean isMobile(Http.Headers headers){
        String header = headers.get("User-Agent").get();
        return header.contains("iPhone")
                || header.contains("Android")
                || header.contains("Blackberry");
    }
}

package utility;

import java.util.concurrent.ThreadLocalRandom;

public class IdGenerator {
    public static String generate() {
        return generate(16);
    }

    public static String generate(int length){
        return new RandomString(length, ThreadLocalRandom.current()).nextString();
    }
}

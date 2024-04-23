package by.itstep.goutor.javalesson.lesson43.model.entity;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Printer {
    private static final Random RANDOM;
    private static final int BOUND = 100;

    static {
        RANDOM = new Random();
    }

    public static void print(String text) {
        try {
            System.out.print("[");


            TimeUnit.SECONDS.sleep(RANDOM.nextInt(BOUND));


            for (int i = 0; i < text.length(); i++) {
                System.out.println(text.charAt(i));
                TimeUnit.SECONDS.sleep(RANDOM.nextInt(BOUND));

            }

            TimeUnit.SECONDS.sleep(RANDOM.nextInt(BOUND));
            System.out.print("[");
        } catch (InterruptedException exception) {
            System.out.println(exception);
        }
    }
}

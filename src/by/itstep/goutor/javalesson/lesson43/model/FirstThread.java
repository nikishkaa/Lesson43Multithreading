package by.itstep.goutor.javalesson.lesson43.model;

public class FirstThread extends Thread {
    private int number;

    public FirstThread(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        System.out.println();
        for (int i = 0; i < 100; i++) {
            System.out.println(number + "child thread is running...");
            try {
                Thread.sleep(500);
            } catch (InterruptedException exception) {
                System.out.println(exception);
            }
        }
    }
}

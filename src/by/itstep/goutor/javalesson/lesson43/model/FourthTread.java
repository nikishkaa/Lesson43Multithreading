package by.itstep.goutor.javalesson.lesson43.model;

public class FourthTread implements Runnable {
    private Thread thread;
    private int number;
    private volatile boolean running;

    public FourthTread(int number) {
        this.number = number;
        thread = new Thread(this);
        thread.start();
    }

    @Override
    public void run() {
        while (running) {
            System.out.println(number + "child thread is running...");
            try {
                Thread.sleep(500);
            } catch (InterruptedException exception) {
                System.out.println(exception);
            }
        }
    }

    public void stop() {
        running = false;

    }

    public Thread getThread() {
        return thread;
    }
}

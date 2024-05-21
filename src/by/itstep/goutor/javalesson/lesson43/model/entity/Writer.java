package by.itstep.goutor.javalesson.lesson43.model.entity;

import java.util.concurrent.TimeUnit;

public class Writer implements Runnable {
    private Thread thread;
    private String text;
    private Printer printer;

    public Writer(String text, Printer printer, Object object) {
        this.thread = new Thread(this);
        this.printer = printer;
        this.text = text;
        thread.start();
    }

    @Override
    public void run() {
        int number = 0;

        while (true) {
            if (printer.getLock().tryLock()) {
                try {
                    printer.print(text);
                    break;
                } finally {
                    printer.getLock().unlock();
                }
            } else {
                text += " " + number++;
                try {
                    TimeUnit.MILLISECONDS.sleep(1000);
                } catch (InterruptedException exception) {
                    System.out.println(exception);
                }
            }
        }
    }
}

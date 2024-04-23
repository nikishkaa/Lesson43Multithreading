package by.itstep.goutor.javalesson.lesson43.model.entity;

public class Writer implements Runnable {
    private Thread thread;
    private String text;

    public Writer(String text) {
        this.thread = new Thread(this);
        this.text = text;
        thread.start();
    }

    @Override
    public void run() {
        Printer.print(text);
    }
}

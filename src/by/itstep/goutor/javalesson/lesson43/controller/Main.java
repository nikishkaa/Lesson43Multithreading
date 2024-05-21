package by.itstep.goutor.javalesson.lesson43.controller;

import by.itstep.goutor.javalesson.lesson43.model.entity.Printer;
import by.itstep.goutor.javalesson.lesson43.model.entity.Writer;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        String[] text = {"First writer", "Second writer", "Third writer", "Four writer"
                , "Five writer"};

        Printer printer = new Printer();
        Lock lock = new ReentrantLock();

        for (int i = 0; i < text.length; i++) {
            new Writer(text[i], printer, lock);
        }


//        Printer printer = new Printer();
//        Printer printer2 = new Printer();
//        Object o = new Object();
//
//        for (int i = 0; i < 3; i++) {
//            new Writer(text[i], printer, o).run();
//        }





        /*/    /*/
        /*System.out.println("start main thread");
        Thread main = Thread.currentThread();

        System.out.println("Name " + main.getName());
        System.out.println("Group name " + main.getThreadGroup().getName());
        System.out.println("Priority " + main.getPriority());*/


        /*/    /*/
        /*FourthTread tread1 = new FourthTread(1);

        Thread.sleep(2000);
        tread1.stop();
        tread1.getThread().join();*/


        /*/   /*/
        /*FirstThread thread1 = new FirstThread(1);
        FirstThread thread2 = new FirstThread(2);

        thread1.start();
        thread2.start();

//        while(thread1.isAlive() || thread2.isAlive()){
//            Thread.sleep(2000);
//        }

//        thread1.join();
//        thread2.join();

        Thread.sleep(2000);

        thread1.interrupt();
        thread2.interrupt();*/



        /*/    /*/
    /*    FirstThread thread1 = new FirstThread(1);

        thread1.start();

        Thread.sleep(2000);

        thread1.stop();*/


        /*/     /*/
       /* FourthTread tread1 = new FourthTread(1);
        FourthTread tread2 = new FourthTread(2);
        FourthTread tread3 = new FourthTread(3);*/

        /*/    /*/
        /*ThirdThread thread1 = new ThirdThread(1);
        ThirdThread thread2 = new ThirdThread(2);
        ThirdThread thread3 = new ThirdThread(3);

        Thread thread01 = new Thread(thread1);
        Thread thread02 = new Thread(thread2);
        Thread thread03 = new Thread(thread3);

        thread01.start();
        thread02.start();
        thread03.start();*/


        /*/     /*/
        /*SecondThread thread1 = new SecondThread(1);
        SecondThread thread2 = new SecondThread(2);
        SecondThread thread3 = new SecondThread(3);*/

        /*/   /*/
        /*FirstThread thread1 = new FirstThread(1);
        FirstThread thread2 = new FirstThread(2);
        FirstThread thread3 = new FirstThread(3);

        thread1.start();
        thread2.start();
        thread3.start();*/

        /*/     /*/
       /*FirstThread firstThread = new FirstThread();

        System.out.println("ID: " + firstThread.getId());
        System.out.println("name: " + firstThread.getName());
        System.out.println("priority: " + firstThread.getPriority());
        System.out.println("state: " + firstThread.getState());
        System.out.println("alive: " + firstThread.isAlive());
        System.out.println("demon: " + firstThread.isDaemon());
        System.out.println("group name: " + firstThread.getThreadGroup().getName());
        */
    }


}

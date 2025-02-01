package org.design.commons;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Run {


    public static void main(String[] args) {
        //Liskov substitution
        Payment.healthCheck();
        Payment payment = new UPIPayment();
        //payment.processPayment();
        payment.transactionMessage();

        //Singleton class
        /*Logger logger = Logger.getLogger();
        logger.logMessage("Hey, messaged logged..");

        Logger logger1 = Logger.getLogger();
        logger1.logMessage("Hey, messaged logged 1..");

        Logger logger2 = Logger.getLogger();
        logger2.logMessage("Hey, messaged logged 2..");*/


        //Thread safe singleton
        Thread thread1 = new Thread(() -> {
            Logger logger1 = Logger.getLogger();
            logger1.logMessage("Hey, messaged logged1.. ThreadID ::" + Thread.currentThread().threadId());
        });

        Thread thread2 = new Thread(() -> {
            Logger logger2 = Logger.getLogger();
            logger2.logMessage("Hey, messaged logged2.. ThreadID::" + Thread.currentThread().threadId());
        });

        thread1.run();      //THis will execute the method in same caller thread

        thread1.start();
        thread2.start();


        //Generics

        Pair<String, Integer> pair = new Pair<>();

        pair.setKey("Roll No");
        pair.setValue(21);

        System.out.println(pair);

       /* Thread daemonThread = new Thread(() -> {
            int i = 0;
            while (i < 100) {
                i++;
                System.out.println("Daemon thread running...");
            }
        });
        daemonThread.setDaemon(true); // Set the thread as daemon
        daemonThread.start();

        System.out.println("Main thread finished.");*/

    }
}

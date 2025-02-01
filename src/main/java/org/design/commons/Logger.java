package org.design.commons;

public class Logger {

    private static Logger logger;

    private Logger() {
        System.out.println("Instance created..");
    }

    public synchronized static Logger getLogger() {
        if(logger == null) logger = new Logger();
        return logger;
    }

    public void logMessage(String message) {
        System.out.println(message + " " + logger);
    }




}

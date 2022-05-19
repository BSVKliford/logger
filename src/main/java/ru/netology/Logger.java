package ru.netology;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Logger {
    private static Logger logger;
    protected int num = 1;

    public void log(String msg) {
        Date dateNow = new Date();
        SimpleDateFormat formatForDateNow = new SimpleDateFormat("dd.MM.yyyy  HH:mm:ss");
        System.out.println("[" + formatForDateNow.format(dateNow) + " " + num++ + "] " + msg);
    }

    private Logger() {
    }

    public static Logger getInstance() {
        if (logger == null) logger = new Logger();
        return logger;
    }
}
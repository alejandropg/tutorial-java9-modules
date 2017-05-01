package com.autentia.logging.console;

import com.autentia.logging.Logger;

public class ConsoleLogger implements Logger {

    public void error(String msg) {
        log("ERROR", msg);
    }

    public void info(String msg) {
        log("INFO",msg);
    }
    public void debug(String msg) {
        log("DEBUG", msg);
    }

    private void log(String level, String msg) {
        System.out.println("[" + level + "] - " + msg);
    }

}

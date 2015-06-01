package org.ababup1192;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

public class Main {

    public static void main(String[] args) {
        ThreadFactory threadFactory = Executors.defaultThreadFactory();
        threadFactory.newThread(new Printer("foo")).start();
        threadFactory.newThread(new Printer("bar")).start();
    }

}

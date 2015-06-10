package org.ababup1192;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

public class Main {

    public static void main(String[] args) {
        Bank bank = new Bank("A Bad Bank", 3000);
        ThreadFactory threadFactory = Executors.defaultThreadFactory();
        threadFactory.newThread(new Client(bank)).start();
        threadFactory.newThread(new Client(bank)).start();
    }

}

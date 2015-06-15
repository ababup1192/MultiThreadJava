package org.ababup1192;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

public class Main {

    public static void main(String[] args) {
        Person alice = new Person("Alice", "Alaska");
        ThreadFactory threadFactory = Executors.defaultThreadFactory();
        for (int i = 0; i < 3; i++) {
            threadFactory.newThread(new PrintPerson(alice)).start();
        }
    }

}

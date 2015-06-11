package org.ababup1192;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

public class Main {

    public static void main(String[] args) {
        Gate gate = new Gate();

        ThreadFactory threadFactory = Executors.defaultThreadFactory();
        threadFactory.newThread(new User(gate, "Alice", "Alaska")).start();
        threadFactory.newThread(new User(gate, "Bobby", "Brazil")).start();
        threadFactory.newThread(new User(gate, "Chris", "Canada")).start();
    }

}

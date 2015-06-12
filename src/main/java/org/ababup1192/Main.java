package org.ababup1192;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

public class Main {

    public static void main(String[] args) {
        BoundedResource resource = new BoundedResource(3);

        ThreadFactory threadFactory = Executors.defaultThreadFactory();
        for (int i = 0; i < 10; i++) {
            threadFactory.newThread(new User(resource)).start();
        }
    }

}

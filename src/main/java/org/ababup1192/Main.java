package org.ababup1192;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

public class Main {

    public static void main(String[] args) {
        Tool spoon = new Tool("Spoon");
        Tool fork = new Tool("Fork");
        Pair pair = new Pair(spoon, fork);
        ThreadFactory threadFactory = Executors.defaultThreadFactory();
        threadFactory.newThread(new Eater("Alice", pair)).start();
        threadFactory.newThread(new Eater("Bobby", pair)).start();
    }

}

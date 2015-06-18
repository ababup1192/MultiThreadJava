package org.ababup1192;

import java.util.Random;

public class Eater extends Thread {
    private final Random random;
    private final Table table;

    public Eater(String name, Table table, long seed) {
        super(name);
        this.table = table;
        this.random = new Random(seed);
    }

    public void run() {
        try {
            while (true) {
                String cake = table.take();
                Thread.sleep(random.nextInt(1000));
            }
        } catch (InterruptedException e) {
        }
    }

}

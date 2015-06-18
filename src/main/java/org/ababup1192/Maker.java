package org.ababup1192;

import java.util.Random;

public class Maker extends Thread {

    private final Random random;
    private final Table table;
    private static int id = 0;

    public Maker(String name, Table table, long seed) {
        super(name);
        this.table = table;
        this.random = new Random(seed);
    }

    public void run() {
        try {
            while (true) {
                Thread.sleep(random.nextInt(1000));
                String cake = "[ Cake No." + nextId() + " by " + getName() + " ]";
                table.put(cake);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static synchronized int nextId() {
        return id++;
    }
}

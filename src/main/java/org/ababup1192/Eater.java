package org.ababup1192;

public class Eater implements Runnable {
    private String name;
    private final Pair pair;

    public Eater(String name, Pair pair) {
        this.name = name;
        this.pair = pair;
    }

    @Override
    public void run() {
        while (true) {
            eat();
        }
    }

    public void eat() {
        synchronized (pair) {
            System.out.println(name + " takes up" + pair + ".");
            System.out.println(name + " is eating now, yum yum!");
            System.out.println(name + " puts down " + pair + ".");
        }
    }
}
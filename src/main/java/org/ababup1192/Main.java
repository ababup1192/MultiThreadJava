package org.ababup1192;

public class Main {

    public static void main(String[] args) {

        Thread thread = new MyThread();
        thread.start();

        for (int i = 0; i < 10000; i++) {
            System.out.print("[Good:" + i + "!]");
        }
    }

}

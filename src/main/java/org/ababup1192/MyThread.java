package org.ababup1192;

public class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            System.out.print("[Nice:" + i + "!]");
        }
    }
}

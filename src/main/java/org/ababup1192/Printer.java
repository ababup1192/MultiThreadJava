package org.ababup1192;

public class Printer implements Runnable {
    private String message;

    public Printer(String message) {
        this.message = message;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.print(message);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

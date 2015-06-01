package org.ababup1192;

public class Main {

    public static void main(String[] args) {

        new Thread(new Printer("foo")).start();
        new Thread(new Printer("bar")).start();

    }

}

package org.ababup1192;

public class Main {

    public static void main(String[] args) {
        Data data = new Data("data.txt", "(empty)");
        new Changer("Changer", data).start();
        new Saver("Saver", data).start();
    }

}

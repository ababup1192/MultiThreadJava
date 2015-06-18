package org.ababup1192;

public class Main {

    public static void main(String[] args) {
        Table table = new Table(3);
        new Maker("MakerThread-1", table, 31415).start();
        new Maker("MakerThread-2", table, 92633).start();
        new Maker("MakerThread-3", table, 58979).start();
        new Eater("EaterThread-1", table, 32384).start();
        new Eater("EaterThread-2", table, 62643).start();
        new Eater("EaterThread-3", table, 38327).start();
    }

}

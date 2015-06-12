package org.ababup1192;

public class Log {
    public static void println(String s){
        System.out.println(Thread.currentThread().getName() + ": " + s);
    }
}

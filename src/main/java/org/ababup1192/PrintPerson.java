package org.ababup1192;

public class PrintPerson implements Runnable {
    private Person person;

    public PrintPerson(Person person) {
        this.person = person;
    }

    @Override
    public void run() {
        while (true) {
            System.out.println(Thread.currentThread().getName() + " prints " + person);
        }
    }
}

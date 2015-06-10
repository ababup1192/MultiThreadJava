package org.ababup1192;

public class Bank {
    private int money;
    private String name;

    public Bank(String name, int money) {
        this.name = name;
        this.money = money;
    }

    public synchronized void deposit(int money) {
        try {
            Thread.sleep(1000);
            this.money += money;
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public synchronized boolean withdraw(int money) {
        if (this.money >= money) {
            this.money -= money;
            return true;
        } else {
            return false;
        }
    }

    public String getName() {
        return name;
    }

    public int getMoney() {
        return money;
    }

    public String getStatus() {
        return name + " has " + money + ".";
    }
}

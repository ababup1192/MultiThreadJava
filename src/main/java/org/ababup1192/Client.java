package org.ababup1192;

public class Client implements Runnable {
    private Bank bank;

    public Client(Bank bank) {
        this.bank = bank;
    }

    @Override
    public void run() {
        while (true) {
            if (bank.withdraw(1000)) {
                bank.deposit(1000);
            }
            System.out.println(bank.getStatus());
        }
    }
}

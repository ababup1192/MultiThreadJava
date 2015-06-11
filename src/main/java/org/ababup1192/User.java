package org.ababup1192;

public class User implements Runnable {
    private final Gate gate;
    private final String myName;
    private final String myAddress;

    public User(Gate gate, String myName, String myAddress){
        this.gate = gate;
        this.myName = myName;
        this.myAddress = myAddress;
    }

    @Override
    public void run() {
        System.out.println(myName + " BEGIN");
        while (true) {
            gate.pass(myName, myAddress);
        }
    }
}

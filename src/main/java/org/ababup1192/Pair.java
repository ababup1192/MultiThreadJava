package org.ababup1192;

public class Pair {
    private final Tool leftHand;
    private final Tool rightHand;

    public Pair(Tool leftHand, Tool rightHand){
        this.leftHand = leftHand;
        this.rightHand = rightHand;
    }

    @Override
    public String toString() {
        return "[ " + leftHand + " and " + rightHand + " ]";
    }
}

package org.ababup1192.activeobject;

public interface ActiveObject {
    Result<String> makeString(int count, char fillChar);

    void displayString(String string);
}

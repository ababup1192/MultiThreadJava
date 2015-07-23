package org.ababup1192;

import org.ababup1192.activeobject.ActiveObject;
import org.ababup1192.activeobject.ActiveObjectFactory;

public class Main {

    public static void main(String[] args) {
        ActiveObject activeObject = ActiveObjectFactory.createActiveObject();
        new MakeClientThread("Alice", activeObject).start();
        new MakeClientThread("Bobby", activeObject).start();
        new MakeClientThread("Chris", activeObject).start();
    }

}

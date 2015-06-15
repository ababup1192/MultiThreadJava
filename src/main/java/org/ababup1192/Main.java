package org.ababup1192;

public class Main {

    public static void main(String[] args) {
        RequestQueue requestQueue = new RequestQueue();
        new Client(requestQueue, "Alice", 3141592L).start();
        new Server(requestQueue, "Bobby", 6535897L).start();
    }

}

package org.ababup1192;

import java.util.Random;

public class Server extends Thread{
    public final Random random;
    private final RequestQueue requestQueue;

    public Server(RequestQueue requestQueue, String name, long seed){
        super(name);
        this.requestQueue = requestQueue;
        this.random = new Random(seed);
    }

    @Override
    public void run(){
        for(int i=0; i< 10000; i++){
            Request request = requestQueue.getRequest();
            System.out.println(Thread.currentThread().getName() + " headless " + request);
            try{
                Thread.sleep(random.nextInt(1000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }


}

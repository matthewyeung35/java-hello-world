package org.matthew.concurrency;

public class Main {
    public static void main(String[] args) {
        // worker thread
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i=0; i<5; i++){
                    System.out.println("printing from worker thread" + i);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        thread.start();
        //main thread
        for (int i=0; i<5; i++){
            System.out.println("printing from main thread" + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // catching exceptions
        int a = 2;
        int b = 0;
        try{
            System.out.println(a/b);
        } catch(Exception e){
            e.printStackTrace();
            System.out.println("b was zero");
        }

    }
}

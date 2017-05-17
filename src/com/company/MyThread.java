package com.company;


public class MyThread extends Thread {

    private String id;

    public MyThread(String id) {
        this.id = id;
    }


    @Override
    public void run() {

        for (int i = 0; i < 1000; i++ ){
            System.out.println("I'm the "+ id +" i= " + i);
        }


    }
}

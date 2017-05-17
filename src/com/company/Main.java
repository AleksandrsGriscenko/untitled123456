package com.company;

import java.util.Random;

public class Main {

    private static final NumberCollector collector
            = new NumberCollector();

    public static void main(String[] args) {
        System.out.println("PROGRAM START");


        for (int i = 0; i < 50; i++) {
            Thread thread = new Thread(Main::doInThread); //lambda

            thread.start();
        }


        System.out.println("PROGRAM FINISH");
    }

    public static void doInThread() {
        Random random = new Random();
        for (int i = 0; i < 50000; i++) {
            int num = random.nextInt();
            collector.add(num);
        }
    }


}


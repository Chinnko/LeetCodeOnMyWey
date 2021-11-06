package com.chinnko;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Integer FLAG = 1;
        // write your code here
        Thread threadA = new Thread() {
            @Override
            public void run() {
                    System.out.println("A");
            }
        };
        Thread threadB = new Thread() {
            @Override
            public void run() {
                    System.out.println("B");
            }
        };
        Thread threadC = new Thread() {
            @Override
            public void run() {
                    System.out.println("C");
            }
        };
        threadA.start();
        threadA.join();
        threadB.start();
        threadB.join();
        threadC.start();
        threadC.join();

    }
}

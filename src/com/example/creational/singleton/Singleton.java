package com.example.creational.singleton;


public class Singleton {

    private static Singleton instance;


    private Singleton() {
        System.out.println("I am creted");
    }

    public static Singleton getInstance() {

        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}

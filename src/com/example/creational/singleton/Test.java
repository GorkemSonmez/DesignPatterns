package com.example.creational.singleton;

/**
 * @author Bahadır Memiş
 * @since 1.0.0
 */
public class Test {

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++){
            Singleton singleton = Singleton.getInstance();
            System.out.println(singleton);
        }
        /**
         * Output:
         *
         * I am creted
         * main.java.designpatterns.creational.singleton.Singleton@4dd8dc3
         * main.java.designpatterns.creational.singleton.Singleton@4dd8dc3
         * main.java.designpatterns.creational.singleton.Singleton@4dd8dc3
         * main.java.designpatterns.creational.singleton.Singleton@4dd8dc3
         * main.java.designpatterns.creational.singleton.Singleton@4dd8dc3
         * main.java.designpatterns.creational.singleton.Singleton@4dd8dc3
         * main.java.designpatterns.creational.singleton.Singleton@4dd8dc3
         * main.java.designpatterns.creational.singleton.Singleton@4dd8dc3
         * main.java.designpatterns.creational.singleton.Singleton@4dd8dc3
         * main.java.designpatterns.creational.singleton.Singleton@4dd8dc3
         *
         *
         */


    }
}

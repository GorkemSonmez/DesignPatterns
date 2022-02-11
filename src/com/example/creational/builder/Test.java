package com.example.creational.builder;

public class Test {
    public static void main(String[] args) {
        Person person=new Person.Builder().name("Görkem").surname("Sönmez").build();
        System.out.println(person);
    }
}

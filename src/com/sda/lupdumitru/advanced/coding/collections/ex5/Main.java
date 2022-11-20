package com.sda.lupdumitru.advanced.coding.collections.ex5;

/**
 * Create a Storage class that will have a private Map field, a public constructor, and methods:
 * addToStorage(String key, String value)* → adding elements to the storage
 * printValues(String key)* → displaying all elements under a given key findValues(String value)
 * → displaying all keys that have a given value
 * The Storage class should allow you to store multiple values under one key.
 */

public class Main {
    public static void main(String[] args) {
        Storage students = new Storage();
        students.addToStorage("Ro45","Andrei");
        students.addToStorage("Ro45","Alex");
        students.addToStorage("Ro45","Larisa");
        students.addToStorage("Ro45","Dumitru");
        students.addToStorage("Ro46","Andrei");
        students.addToStorage("Ro46","Bogdan");
        students.addToStorage("Ro46","Elena");

        students.printValues("Ro45");
        students.printValues("Ro46");
        students.printValues("Ro47");

        System.out.println(students.findKeys("Andrei"));
        System.out.println(students.findKeys("Bogdan"));
        System.out.println(students.findKeys("Ion"));


    }
}

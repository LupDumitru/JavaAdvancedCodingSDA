package com.sda.lupdumitru.advanced.coding.collections.ex7;

import java.util.Comparator;
import java.util.TreeMap;

/**
 * Create a method that accepts TreeMap and prints the first and last EntrySet in the console.
 */

public class Main {
    public static void main(String[] args) {
        TreeMap<String,String> treemap=new TreeMap<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
               return o2.compareTo(o1);
            }
        });
        treemap.put("BMW","X6");
        treemap.put("Renault","Megane");
        treemap.put("Dacia","Logan");
        treemap.put("Ford","Focus");
        printFirstAndLastEntry(treemap);


    }
    public static void printFirstAndLastEntry(TreeMap<String,String>input){
        System.out.println("First entry : "+input.firstEntry());
        System.out.println("Last entry : "+input.lastEntry());

    }
}

package com.sda.lupdumitru.advanced.coding.collections.ex6;

/**
 * Ex 6 Ratings received. Display their average. The numbers can not be less than 1 and greater than 6.
 */

public class Main {
    public static void main(String[] args) {
        ProductRatings product=new ProductRatings("CD");
        System.out.println(product.averageRating());
        product.addRating(1);
        product.addRating(6);
        product.addRating(5);
        product.addRating(4);
        product.addRating(3);
        System.out.println(product.averageRating());
        try{
            product.addRating(8);
        } catch (IllegalArgumentException e){
            e.printStackTrace();

        }
        try{
            product.addRating(0);
        } catch (IllegalArgumentException e){
            e.printStackTrace();

        }

        System.out.println(product.averageRating());






    }
}

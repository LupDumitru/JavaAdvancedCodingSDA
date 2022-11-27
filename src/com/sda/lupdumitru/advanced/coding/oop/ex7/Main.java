package com.sda.lupdumitru.advanced.coding.oop.ex7;

/**
 * Change the BasketFullException and BasketEmptyException exceptions from runtime exception type to checked exception type.
 * Handle them.
 */

public class Main {
    public static void main(String[] args) {
        Basket basket = new Basket(5);
        try {

            basket.addToBasket("eggs");
            basket.addToBasket("eggs");
            basket.addToBasket("eggs");
            basket.addToBasket("eggs");
            basket.addToBasket("eggs");
            basket.addToBasket("eggs");
            basket.addToBasket("eggs");

        } catch (BasketFullException e) {
            System.err.println(e.getMessage());
        }finally {
            System.out.println(basket);
        }
    }
}
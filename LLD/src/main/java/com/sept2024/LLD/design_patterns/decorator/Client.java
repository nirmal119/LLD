package com.sept2024.LLD.design_patterns.decorator;

public class Client {
    public static void main(String[] args) {
        IceCream iceCream = new OrangeCone();
        iceCream = new VanillaScoop(iceCream);
        iceCream = new ChocolateCone(iceCream);


        System.out.println(iceCream.getCost());
        System.out.println(iceCream.getDescription());
    }
}

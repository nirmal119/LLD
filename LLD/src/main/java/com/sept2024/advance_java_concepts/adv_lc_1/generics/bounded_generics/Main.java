package com.sept2024.advance_java_concepts.adv_lc_1.generics.bounded_generics;

public class Main {
    public static void main(String[] args) {
        AnimalPrinter<Cat> catPrinter = new AnimalPrinter<>(new Cat());
        catPrinter.giveFood();
        AnimalPrinter<Dog> dogPrinter = new AnimalPrinter<>(new Dog());
        AnimalPrinter<Animal> animalPrinter = new AnimalPrinter<>(new Animal());
    }
}

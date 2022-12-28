package com.epam.OOP;

public class Dog extends Animal{

    public Dog() {
        super("brown", 4, true);
    }

    @Override
    public void getDescription() {
        super.getDescription();
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.getDescription();
    }
}

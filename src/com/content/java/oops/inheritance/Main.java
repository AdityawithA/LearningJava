package com.content.java.oops.inheritance;


class Animal {
    String name;

    public Animal(String name) {
        this.name = name;
    }

    public void makeSound() {
        System.out.println(name + " makes a sound.");
    }
}
public class Main {
    public static void main(String[] args) {
        Animal myAnimal = new Animal("Elephant");
        System.out.println(myAnimal.name);
        myAnimal.makeSound();

        Child myDog = new Child("Tommy");
        myDog.makeSound();
        myDog.fetch();
    }
}

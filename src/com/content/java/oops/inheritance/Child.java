package com.content.java.oops.inheritance;


class Child extends Animal {

    public Child(String name) {
        super(name); // Calls the parent class constructor
    }


    @Override
    public void makeSound() {
        System.out.println(name + " barks.");
    }


    public void fetch() {
        System.out.println(name + " is fetching the ball!");
    }
}



package com.content.java.oops.abstraction;

public class Faculty implements College{

    @Override
    public void display() {

    }

    @Override
    public String giveName() {
        return " Ankit";
    }

    @Override
    public String department() {
        return "IT";
    }
}

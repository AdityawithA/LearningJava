package com.content.java.oops.abstraction;

public class Student implements College{

    @Override
    public void display() {
        System.out.println("CSE");

    }

    @Override
    public String giveName() {
        return "Aditya";
    }

    @Override
    public String department() {
        return "CSE";
    }

    @Override
    public int hashCode() {
        return department().hashCode();
    }
}

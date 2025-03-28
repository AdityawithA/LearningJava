package com.content.java.ExceptionHandling;

public class NullpointerException {
    public static void main(String[] args) {
        String str = null;

        try {
            System.out.println("String length: " + str.length()+" Aditya");
        } catch (NullPointerException e) {
            System.out.println(" NullPointerException! The string is null." +e.getMessage());
        }finally {
            System.out.println("This will run firstly anyhow:");
        }


    }
}


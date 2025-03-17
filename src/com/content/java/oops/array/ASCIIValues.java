package com.content.java.oops.array;

public class ASCIIValues {
    public static void main(String[] args) {
        System.out.println("ASCIIValues from A to Z:" );
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            System.out.println(ch + " = " + (int) ch);
        }
        System.out.println("\nASCII values of a to z:");
        for (char ch = 'a'; ch <= 'z'; ch++) {
            System.out.println(ch + " = " + (int) ch);
        }
    }
}

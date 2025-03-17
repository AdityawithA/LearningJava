package com.content.java.oops.abstraction;

public class Implementation {
    public static void main(String[] aditya){
        College c1 = new Student();
        System.out.println(c1.giveName());
        System.out.println(c1.department());
        College c2 = new Faculty();
        System.out.println(c2.giveName());
        System.out.println(c2.department());
        System.out.println(c1.hashCode());

    }
}

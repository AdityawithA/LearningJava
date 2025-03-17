package com.content.java.oops.collections;

public class ArrayList {
    public static void main(String[] args) {
        java.util.ArrayList<String> names = new java.util.ArrayList<>();
        names.add("Rohit");
        names.add("Virat");
        names.add("Rahul");

        names.remove("Rohit");
        names.remove(0);

        System.out.println(names);
    }
}


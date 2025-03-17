package com.content.java.oops.encapsulation;

class Student {
    private String name;

    public void setName(String Aditya) {
        name = Aditya;
    }

    public String getName() {
        return name;
    }
}

public class StudentDetails {
    public static void main(String[] args) {
        Student stu = new Student();
        stu.setName("Kumar");
        System.out.println("Name: " + stu.getName());
    }
}


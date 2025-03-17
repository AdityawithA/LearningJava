package com.content.java.io.serder;

import java.io.Serializable;

class Student implements Serializable {
    private static final long serialVersionUID = 1L;

    String name;
    int age;


    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return "Student{name='" + name + "', age=" + age + "', }";
    }
}



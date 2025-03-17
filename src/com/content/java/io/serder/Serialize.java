package com.content.java.io.serder;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Serialize {
    public static void main(String[] args) throws Exception {
        Student student = new Student("Aditya", 19);

        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("student.ser"));
        out.writeObject(student);
        out.close();

        System.out.println("Object Serialized Successfully!");
    }
}




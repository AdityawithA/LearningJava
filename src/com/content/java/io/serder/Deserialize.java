package com.content.java.io.serder;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Deserialize {
    public static void main(String[] args) throws Exception {

        ObjectInputStream in = new ObjectInputStream(new FileInputStream("student.ser"));
        Student student = (Student) in.readObject();
        in.close();

        System.out.println("Deserialized Object: " + student);
    }
}



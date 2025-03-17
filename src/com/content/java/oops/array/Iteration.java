package com.content.java.oops.array;

class Iteration {
    public static void printArray(int[] arr, int times) {
        for (int i = 0; i < times; i++) {
            for (int num : arr) System.out.print(num + " ");
            System.out.println();
        }
    }

    public static void printArray(String[] arr, int times) {
        for (int i = 0; i < times; i++) {
            for (String str : arr) System.out.print(str + " ");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        String[] words = {"Aditya", "Doing", "Java"};
        int repeat = 10;

        printArray(numbers, repeat);
        printArray(words, repeat);
    }
}

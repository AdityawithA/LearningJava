package com.content.java.oops.collections;

public class BubbleSort {
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] numbers = {5, 2, 9, 1, 5, 6};

        System.out.println("Before Sorting:");
        for (int num : numbers) System.out.print(num + " ");

        bubbleSort(numbers);

        System.out.println("\nAfter Sorting:");
        for (int num : numbers) System.out.print(num + " ");
    }
}


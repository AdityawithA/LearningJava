package com.content.java.oops.array;

import java.util.Arrays;

public class MergedArray {
    public static void main(String[] args) {
        int[] arr1 = {50, 3, 5};
        int[] arr2 = {2, 10, 6};

        int[] merged = new int[arr1.length + arr2.length];
        System.arraycopy(arr1, 0, merged, 0, arr1.length);
        System.arraycopy(arr2, 0, merged, arr1.length, arr2.length);

        Arrays.sort(merged);
        System.out.println("Merged Array: " + Arrays.toString(merged));


    }
}

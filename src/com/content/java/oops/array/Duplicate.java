package com.content.java.oops.array;

public class Duplicate {
    public static void main(String[] args) {
        int[] num = {1,2,2,1,5,9,8,6,3,4,2,9,4};
        for (int i = 0; i < num.length; i++) {
            for (int j = i+1; j < num.length; j++){
                if (num[i] == num[j]){
                    System.out.println(num[i]);
                }
            }

        }
    }
}

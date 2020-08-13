package com.codewithdelayne;

public class SimpleArraySum {
    static int simpleArraySum(int[] ar) {
        int sum = 0;
        for(int i = 0; i < ar.length; i++){

            sum = sum + ar[i];

        }
        return sum;
    }

    public static void main(String[] args) {
        int[] ar = new int[] {1, 2, 3, 4, 10, 11};

        System.out.println(simpleArraySum(ar));

    }
}

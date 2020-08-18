package com.codewithdelayne;

public class DivisibleSumPairs {

    // Complete the divisibleSumPairs function below.
    static int divisibleSumPairs(int n, int k, int[] ar) {
         int pairs = 0;
        for(int i = 0; i < ar.length; i++){
            for(int j = i; j < ar.length; j++){
                if(i != j && (ar[i] + ar[j]) % k == 0){
                    pairs++;

                }
            }

        }
        return pairs;


    }

    public static void main(String[] args) {
        int[] ar = new  int[]{1, 3, 2, 6, 1, 2};

        System.out.println(divisibleSumPairs(6, 3, ar));
    }

}
//          Question Summary

// Given: array of n integers, ar= [ar[0], ar[1], ... ar[n-1]
// and a positive integer, k
// find and print:
//
// (i, j) pairs where
// i < j &&
// ar[i] + ar[j] is divisible by k


//                  input:
//  (# of items)    n=6 k=3 (divisor)
// values of array: 1 3 2 6 1 2
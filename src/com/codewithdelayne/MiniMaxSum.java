package com.codewithdelayne;
import java.util.Arrays;

public class MiniMaxSum {
    static void miniMaxSum(int[] arr) {

        Arrays.sort(arr);
        long min = 0;
        long max = 0;

        for(int i = 0; i < arr.length - 1; i++){
            min = min + arr[i];
            max = max + arr[i + 1];
        }
        System.out.println(min + " "+ max);

    }

    public static void main(String[] args) {
    int [] arr = new int[] {1, 2, 3, 4, 5};
      miniMaxSum(arr);

    }
}


//      Question Analysis
//Param: five positive integers

// Task:
// find the minimum and maximum values that can be calculated by
// summing exactly four of the five integers.

//  Output
//print the respective minimum and maximum values
// as a single line of two space-separated long integers.


// Example:
//
//input:
// arr=[1, 3, 5, 7, 9]
//Function:
//The minimum sum is 1+3+5+7=16  and the maximum sum is 3+5+7+9=24.
//output (The output can be greater than a 32 bit integer.):
//answer: 16 24

//Explanation
//
// The numbers are 1,2,3,4,and 5.
// Calculate the following sums using four of the five integers:

// i != 1 && arr.length = 4
//Sum everything except 1, the sum is 2+3+4+5=14
// sum + i
// i != 2 && arr.length = 4
//Sum everything except 2, the sum is 1+3+4+5=13.
//  sum + i
// i != 3 && arr.length = 4
//Sum everything except 3, the sum is 1+2+4+5=12.
//  sum + i
// i != 4 && arr.length = 4
//Sum everything except 4, the sum is 1+2+3+5=11.
//  sum + i
// i != 5 && arr.length = 4
//Sum everything except 5, the sum is 1+2+3+4=10.
//  sum + i


//Hints: Beware of integer overflow! Use 64-bit Integer.
package com.codewithdelayne;

import java.util.Scanner;

public class PlusMinus {


    static void plusMinus(int[] arr) {





    }







    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");


        int[] arr = new int[n];


        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        plusMinus(arr);
        scanner.close();
    }
}


//           Question Analysis

// Given: array of integers
// Task: ratios of elements that are positive, negative, and zero, no return value
//Function Description:   int arr[n]: an array of integers
//The proportions of occurrence are positive: 3/6=0.5000000, negative: 2/6=.333333 and zeros: 1/6=1666667 .
// Print the following 3 lines, each to 6 decimals:
//
// proportion of positive values
//
// proportion of negative values
//
// proportion of zeros
//
//


//Example
//
//There are n=5  elements, two positive, two negative and one zero. Their ratios are 2/5  2/5 and 1/5 . Results are printed as:
//
//0.400000
//0.400000
//0.200000


//Sample Input
// 6
//-4 3 -9 0 4 1

// Output
//0.500000
//0.333333
//0.166667Output



//x = math.abs(a);
// round ((x - floor(x)) * 10^D)

// Algorithm




//traverse trough array
//identify positive or negative
//  if:
// proportion of positive values
// group positives
// if:
// proportion of negative values
// group negatives
// if
// proportion of zeros
// group zeros
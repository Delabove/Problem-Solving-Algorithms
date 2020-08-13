package com.codewithdelayne;

import java.util.Arrays;
import java.util.Scanner;

public class PlusMinus {






// insert in a new array if duplicated to sort

// insert in a new array if duplicated to sort

// insert in a new array if duplicated to sort
//
// edge case:
// null
//
//


    static int[] plusMinus(int[] arr) {


       int[] ration = new int[5];

        int positives= 0;
        int negatives= 0;
        int zeros= 0;

        //traverse through array
        for(int i = 0; i < arr.length; i++) {

            //  if:
            // proportion of positive values
            // group positives

            while (arr[i] > 0) {
                positives++;
                if (positives == arr.length) {
                  ration[0]=  positives/arr.length;
                    System.out.println(Arrays.toString(ration));

                }
            }
            // if
            // proportion of zeros
            // group zeros
            if (arr[i] < 0 || negatives == arr.length)
                negatives++;
            {
                System.out.println("I am working now");
//                    ration[1] = negatives/arr.length;

            }
            // if:
            // proportion of negative values
            // group negatives
            zeros++;
//                        ration[4] = zeros/arr.length;


        }
        return arr;
    }


    public static void main(String[] args) {

       int[] arr = new int[]{-4, 3, -9, 0, 4, 1};


        System.out.println(Arrays.toString(plusMinus(arr)));


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




//traverse through array
//identify positive or negative
//  if:
// proportion of positive values
// group positives
// insert in a new array if duplicated to sort
// if:
// proportion of negative values
// group negatives
// insert in a new array if duplicated to sort
// if
// proportion of zeros
// group zeros
// insert in a new array if duplicated to sort
//
// edge case:
// null
//
//
package com.codewithdelayne;

public class Staircase {
    static void staircase(int n) {


    }

    public static void main(String[] args) {
        int n = 6 * 6;
    }
}

// Question Analysis
//
// base and height are both equal to n
// image is drawn using # symbols and spaces
// last line is not preceded by any spaces.
//
// Write a program that prints a staircase of size n

// Sample Input
//   6  right-aligned height and width of n=6
//
//     #
//    ##
//   ###
//  ####
// #####
//######
//
//
// start with a 6x6 box
// 6 across
// 6 down
// for every row add  1 #
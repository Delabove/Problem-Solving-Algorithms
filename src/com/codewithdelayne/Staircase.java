package com.codewithdelayne;

import java.util.ArrayList;
import java.util.List;

public class Staircase {


    static void staircase(int n) {

        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
            {
                if (i == j) {
                    System.out.println("#");

                }  else
                System.out.println("#");
            }
        }

        System.out.println("");;
    }



    public static void main(String[] args) {
//        int n = 6;
        staircase(6);

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
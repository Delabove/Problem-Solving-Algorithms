package com.codewithdelayne;

import java.util.ArrayList;
import java.util.List;

public class Staircase {

    private static final int ROW = 6;
    private static final int COL = 6;


    static String staircase(int n) {



        int counter = 0;

        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
            {
                if (i == j)


                if (i == n - j - 1)

            }
        }

        return counter;
    }



    public static void main(String[] args) {
        int n = 6;
        System.out.println(staircase(n));
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
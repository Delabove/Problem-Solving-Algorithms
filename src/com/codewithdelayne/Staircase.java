package com.codewithdelayne;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class  Staircase {


    static int staircase(int n) {
        for(int i=0; i<n;++i){
            for (int j= 0;j<((n-i)-1);++j){
                System.out.printf(" ");
            }
            for (int k=0;k<(i+1);++k){
                System.out.printf("#");
            }
            System.out.printf("\n");
        }

        return 0;
    }


    public static void main(String[] args) {
        int n = 6;

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
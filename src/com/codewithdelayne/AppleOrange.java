package com.codewithdelayne;

public class AppleOrange {


    static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {


    }

    public static void main(String[] args) {

    }
}
//      QUESTION ANALYSIS

// S= start pt T= end pt A= pt of apple tree B= pt of orange tree
// falls d units of distance along x-axis: -val of d = fell to the left +val of d= fell to right

// Given:
// val of d for m apples anf n oranges
// determine how many apples and oranges will fall on Sam's house (i.e., in the inclusive range )[s,t]
//
//
// example:
//
//
// house : s=7 & t=10
// A:      a= 4  m=3
// B:      b= 12 n=3
//
// int[] apples = [2, 3, -4] from a=4 =
// add each apple distance to position
// int[] oranges = [3, -2, -4] from b=4
// add each orange distance to position
// compare[apples] with inclusive range [s,t]
// count how many fall in range
// compare[oranges] with inclusive range [s,t]
// count how many fall in range
// print [# apples in range, # of oranges in range]
//
//
//
// input:                   output:
// s= 7 t= 11                  1
// a(d)= 5 b(d)=15             1
// m= 3 n=2
// a= -2 2 1
// b= 5 -6
//
//
//
//
//
//
//
//
//
//
//
//
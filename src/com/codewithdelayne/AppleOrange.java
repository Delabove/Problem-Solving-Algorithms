package com.codewithdelayne;

import java.util.Arrays;

public class AppleOrange {

//      Algorithm
// for loop:
//  The first apple falls at position 5-2=3.
//  The second apple falls at position 5+2=7 .
//  The third apple falls at position 5+1=6.
//  for loop
//  The first orange falls at position 15+5=20.
//  The second orange falls at position 15-6=9.
//  for each apple of apples between 7 & 11, count
//  Only one fruit (the second apple) falls within the region between 7 and 11, so we print 1 as our first line of output.
// //  for each orange of oranges between 7 & 11, count
// Only the second orange falls within the region between 7 and 11, so we print 1 as our second line of output.
// new int[] applesAndOranges = [a,o]
// return applesAndOranges

    static int[] countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {
        int appleCount = 0;
        int orangeCount=0;
        int[] applesAndOranges = new int[2];

        for(int i = 0; i<apples.length; i++){
            int temp = apples[i] + a;
            if(temp >= s && temp <= t){
                appleCount+=1;
            }
            applesAndOranges[0]=appleCount;
        }
        for(int j = 0; j<oranges.length; j++){
            int temp = oranges[j]+b;
            if(temp >= s && temp <= t){
               orangeCount+=1;
            }
            applesAndOranges[1] = orangeCount;
        }

        System.out.println(appleCount);
        System.out.println(orangeCount);
        return applesAndOranges;
    }

    public static void main(String[] args) {

        int[] apples = new int[]{-2,2,1}; //(3)
        int[] oranges = new int[]{5,-6}; //2

        System.out.println(Arrays.toString(countApplesAndOranges(7, 11, 5, 15, apples, oranges)));
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

//      Algorithm
// for loop:
//  The first apple falls at position 5-2=3.
//  The second apple falls at position 5+2=7 .
//  The third apple falls at position 5+1=6.
//  for loop
//  The first orange falls at position 15+5=20.
//  The second orange falls at position 15-6=9.
//  for each apple of apples between 7 & 11, count
//  Only one fruit (the second apple) falls within the region between 7 and 11, so we print 1 as our first line of output.
// //  for each orange of oranges between 7 & 11, count
// Only the second orange falls within the region between 7 and 11, so we print 1 as our second line of output.
// new int[] applesAndOranges = [a,o]
// return applesAndOranges
//
//
//
//
//
//
//
//
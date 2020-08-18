package com.codewithdelayne;

import javax.print.DocFlavor;

public class Kangaroo {
    static String kangaroo(int x1, int v1, int x2, int v2) {

        if((v1-v2)<=0) {
            return ("NO");
        }

        else if((x2-x1)%(v1-v2)==0) {
            return ("YES");
        }
        else
            return("NO");


    }



    public static void main(String[] args) {

        System.out.println(kangaroo(0,3,4,2));
    }

}

//              QUESTION ANALYSIS
//
// K1:  x1 start location  v1 movement in meters
// K2:  x2 start location v2 movement in meters
//
// get both K's at the same location at the same time. If possible, return yes if not return no
//
//
// example:
// K1: x1 = 2 vl=1
// K2: x2= 1 v2=2
//
//After 1 jump:
//(x1 + v1 = 2 + 1, x2+v2 = 1+2) both are at x=3, yes.
//
//
// input: x1=0  v1=3  x2=4  v2=2
// output: YES
//
// input: x1=0 v1=2 x2=5 v2=3
// output: NO
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
//
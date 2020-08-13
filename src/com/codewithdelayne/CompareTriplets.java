package com.codewithdelayne;

import java.util.ArrayList;
import java.util.List;

public class CompareTriplets {

    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        int aCounter = 0;
        int bCounter = 0;
        List<Integer> winner = new ArrayList<>();


        for (Integer value : a) {
            for (Integer integer : b) {
                if (value > integer) {
                    aCounter = aCounter + value;
                    winner.set(0, aCounter );
                }
                if (value < integer) {
                    bCounter = bCounter + integer+
                    winner.set(1, bCounter);
                }

            }
        }
        return winner;
    }




//loop through a[0] and b[0]
// a > b =A+1
//insert into a/b counter
//loop through a[0] and b[0]
//a < b =B+1
//insert into a/b counter
//a = b = null
//return null
// find max between two counters
//
// Display in a winners[a,b]
//
//        If(a>b)
//        winner[aCounter= aCounter + 1, bCounter];
//
//        If(a<b)
//
//        winner[aCounter= aCounter + 1, bCounter= bCounter + 1];
//
//
//        If(a=b)
//        Return null
//
//        Return Math.max(   winner[aCounter= aCounter + 1, bCounter= bCounter + 1]  );
//





    public static void main(String[] args) {

        List<Integer> a = new ArrayList<>(){{
                    add(1);
                    add(1);
                    add(1);

        }};

        List<Integer> b = new ArrayList<>(){{
            add(99);
            add(16);
            add(8);

        }};


        compareTriplets(a,b);

    }
}
//Alice: a= a[0] a[1] a[2]
//Bob:  b= b[0] b[1] b[2]
// Reviewer: 1-100

// a > b =A+1
//
//a < b =B+1
//
//a = b = null
//
// pts[a,b]
//
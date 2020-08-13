package com.codewithdelayne;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class CompareTriplets {

    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        int aCounter = 0;
        int bCounter = 0;
        List<Integer> winner = new LinkedList<>();


        for (int i = 0; i < a.size(); i++)
            if (a.get(i) > b.get(i)) {
                ++aCounter;
            } else if (a.get(i) < b.get(i)) {
                ++bCounter;
            }

             winner.add(aCounter);
             winner.add(bCounter);
             winner.sort(Collections.reverseOrder());

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

        List<Integer> a = new ArrayList<>(3);
            a.add(17);
            a.add(28);
            a.add(30);


        List<Integer> b = new ArrayList<>(3);
        b.add(99);
        b.add(16);
        b.add(38);


        System.out.println(compareTriplets(a,b));


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
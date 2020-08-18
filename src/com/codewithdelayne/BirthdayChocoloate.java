package com.codewithdelayne;

import java.util.ArrayList;
import java.util.List;

public class BirthdayChocoloate {

    static int birthday(List<Integer> s, int d, int m) {

        int count = 0;

        for (int i = 0; i < s.size()-m+1; i++){ //index is less than size of arraylist minus the month + 1
            int sum = 0;
            int t = m;
            int j=i;
            while (t-- != 0){ //while the month does not == 0, add index to the current sum
                sum = sum + s.get(j);
                j++;
            }

            if (sum == d){ //if the sum is == to the day, add to counter
                count++;
            }

        }
        return count;
    }

    public static void main(String[] args) {
        List<Integer> s = new ArrayList<Integer>();

        s.add(1);
        s.add(2);
        s.add(1);
        s.add(3);
        s.add(2);

        System.out.println(birthday(s, 3, 2));
    }
}

// Question Analysis

// length of the segment =  birth month
//  sum of#'s on squares = birth day

// Task: determine how many ways she can divide the chocolate

//ex:
// chocolate bar (array of sq): s=[2, 2, 1, 3, 2]
// sum of bday:  d=4
// length:  m=2
// result: (d)[2,2] and  m[1,3] (start and stop?)

//OUTPUT: # OF WAYS TO DIVIDE CHOCOLATE BAR

//birthday has the following parameter(s):
//
//s: an array of integers, the numbers on each of the squares of chocolate
//d: an integer, Ron's birth day
//m: an integer, Ron's birth month


// SAMPLE INPUT                                                 SAMPLE OUTPUT
// number of squares in the chocolate bar:  5                       2
// numbers on the chocolate squares:        1 2 1 3 2
// birth day and his birth month            3 2


// loop through the bar array
// compare the sum of the number and length to day and month
// if s[i] + i == day && length s[i] == m
// count++

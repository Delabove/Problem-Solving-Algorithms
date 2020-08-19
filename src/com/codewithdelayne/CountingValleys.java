package com.codewithdelayne;

public class CountingValleys {

    static String countingValleys(int n, String s) {
    int valleys = 0;


    }

    public static void main(String[] args) {


        System.out.println(countingValleys("UDDUUDDUU"));
    }

}

//      Question Analysis


//   uphill= U or downhill = D
//  start and end at sea level and each step up or down represents a 1 unit change in altitude
// valley = sequence of U

// Given a sequence of up and down steps, find and print the number of valleys he walked through.

//  example
// if s =[DDUUUUDD] =  he first enters a valley 2 units deep
// Then he climbs out an up onto a mountain 2 units high.
// Finally, he returns to sea level and ends his hike.

// countingValleys has the following parameter(s):
//
//  n: the number of steps Gary takes
//  s: a string describing his path

//  8        -># OF STEPS
//  UDDDUDUU ->string describing his path
//
// iterate over the hike
// find char at i
// if char == U
// uphill++
//  if char == D
// downhill++
// for every 2 valleys
// valleys ++
// print count


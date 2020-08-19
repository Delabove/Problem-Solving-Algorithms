package com.codewithdelayne;
import java.util.Collections;
import java.util.List;

public class PickingNumbers {


    public static int pickingNumbers(List<Integer> a) {

        //***NEEDED HELP WITH THIS ONE... REVIEW UNTIL YOU UNDERSTAND


        //  empty or 1 item
        if (a.size() <= 1)
            return 0;

        //  sort list in ascending order
        Collections.sort(a);


        //  loop counting consecutive numbers whose value is <= 1
        int maxCount	= 0;
        int count 		= 0;
        int fi			= 0;

        for (int i = 1; i < a.size(); i++) {

            //  count this entry (if needed)
            if (Math.abs(a.get(fi) - a.get(i)) <= 1) {

                //  increment the count
                if (count == 0)
                    count = 2;
                else
                    count++;

                //  update the max count (if needed)
                if (count > maxCount)
                    maxCount = count;
            }

            // reset the count
            else {
                count = 0;
                fi 	  = i;
            }

//    		System.out.println("fi: " + fi + " i: " + i + " count: " + count + " maxCount: " + maxCount);
        }

        return maxCount;
    }


    public static void main(String[] args) {

    }

}

//      Question Analysis
//
//
// Given an array of integers
// find and print the maximum number of integers
// you can select from the array such that the

// **they cant me more than 1 apart -sort

// absolute difference between any two of the
// chosen integers is less than or equal to 1
//
// Example:
//
// if your array is a = [1, 1, 2, 2, 4, 4, 5, 5, 5]
// you can create two subarrays meeting the criterion: [1, 1, 2, 2]  and [4,4,5,5,5]
// Max length subarray has 5 elements
//
// return an integer that represents the length of the longest array that can be created
//
//
//                       input                      output
//
//  size of array:       6                           3
//  integers in array:  4 6 5 3 3 1
//
// 2<= n <= 100
// answer will be >=2
//

// Algorithm

// sort
//
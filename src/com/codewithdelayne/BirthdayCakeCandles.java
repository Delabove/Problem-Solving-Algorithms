package com.codewithdelayne;

import java.util.Arrays;

public class BirthdayCakeCandles {
    static int birthdayCakeCandles(int[] ar) {
    int count = 1;
    int maxHeight = 0;

    Arrays.sort(ar); // sort first in case array is not sorted
              // search array for tallest (max)
        for(int i = 0; i < ar.length; i++) {
            // temporarily store largest number
            int tempMax = ar[i];
            // if its higher or same as max,
            if (tempMax >= maxHeight){
                //if they are equal in value,
                if(tempMax == maxHeight)
                    //add to counter
                    count++;

                //store new number in maxHeight
                maxHeight = tempMax;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] ar = new int[]{2,3,1,3};
        //      print sum of tallest (max)
        System.out.println(birthdayCakeCandles(ar));
    }

}


//      Question Analysis

// 1 candle (for each) year of her total age
// can only blow out tallest candles
// task: how many candles can successfully blow out

// ex: if 4yrs old, 4 candles of height 4,4,1,3
// will be able to blow out 2 candles
// since height of tallest = 4 and there are 2

//function description:return integer representing # of candles she can blow out
//parameters: array of integers rep candle heights

// input: 1st line: n = # of candles on cake
//        2nd line: n space separated integers, each i = height of candle i

//constraint:
// 1 <= n <= 100000
// 1 <= arr[i] <= 10000000

// output: # of candles can be blown out

// sample input     sample output
// 4
//3 2 1 3                   2

//explanation:

// we have [1, 2, 3, 3]
// only blows out: 3
//print: 2 (two of tallest candles)

//search array for tallest (max)
//count how many tallest (max)
//print sum of tallest (max)
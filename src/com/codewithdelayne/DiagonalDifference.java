package com.codewithdelayne;

import java.util.ArrayList;
import java.util.List;

public class DiagonalDifference {


    public static int diagonalDifference(List<List<Integer>> arr) {
        int count= 0;





        return count;
    }

    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
    }

}


//  Question Analysis

// given: sq matrix = 2D
// calculate: absolute difference between sums and diagonals
// function description: diagonalDifference takes the following parameter: int arr[n][m]
// return: int absolute diagonal difference



//  Algorithm

// row arr[i]
//column arr[i][j]

// Primary PATTERN

// traverse++ = [i][j]
// add to primary counter
// traverse++ = [i+1][j+1]
// add to primary counter
// traverse++ = [i+2][j+2]
// add to primary counter
// calculate the sum across the primary diagonal



// Secondary PATTERN

// reverse traverse
// traverse-- = [i][j]
// add to primary counter
// traverse-- = [i+1][j-1]
// add to primary counter
// traverse-- = [i+2][j-2]
// add to primary counter
// calculate the sum across the secondary diagonal


// n= # of rows and columns

// calculate the absolute difference Math.abs()
//clear counters

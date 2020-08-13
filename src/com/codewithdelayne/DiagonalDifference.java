package com.codewithdelayne;

import java.util.*;


public class DiagonalDifference {
    public static int diagonalDifference(List<List<Integer>> arr) {

        System.out.println("");
        int primary= 0;
        int secondary = 0;

        for (int i = 0; i < arr.size(); i++)
        {
            for (int j = 0; j < arr.size(); j++)
            {
                if (i == j)
                    primary += arr.get(i).get(j);


                if (i == arr.size() - j - 1)
                    secondary += arr.get(i).get(j);
            }
        }


        return Math.abs(primary - secondary);

}


    public static void main(String[] args) {

        ArrayList<List<Integer>> arr
                = new ArrayList<List<Integer>>();

        List<Integer> list1
                = new ArrayList<Integer>();
        list1.add(11);
        list1.add(2);
        list1.add(4);
        arr.add(list1);

        List<Integer> list2
                = new ArrayList<Integer>();
        list2.add(4);
        list2.add(5);
        list2.add(6);
        arr.add(list2);

        List<Integer> list3
                = new ArrayList<Integer>();
        list3.add(10);
        list3.add(8);
        list3.add(-12);
        arr.add(list3);




            System.out.println(diagonalDifference(arr));
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


// FORMULA:



//how many diagonal lines we have in our array: first getting the length using that to get the number of diagonal lines (diagonalLines)

// use the number of diagonal lines to get the mid-point which will help in the search for row and column indices.

//int length = twoDArray.length
//int diagonalLines = (length + length) - 1
//int midPoint = (diagonalLines / 2) + 1

//Getting Row and Column Indices
//for (int i = 1; i <= diagonalLines; i++)

// number of items in a diagonal line  itemsInDiagonal
//  line 3  (g, e, c) and line 4   (h, f).
//This variable is incremented by 1 in the loop when loop variable i is less or equal to midPoint. It is then decremented by 1 otherwise.

//int rowIndex;
//int columnIndex;

//if (i <= midPoint) {
//    itemsInDiagonal++;
//    for (int j = 0; j < itemsInDiagonal; j++) {
//        rowIndex = (i - j) - 1;
//        columnIndex = j;
//        items.append(twoDArray[rowIndex][columnIndex]);
//    }
//} else {
//    itemsInDiagonal--;
//    for (int j = 0; j < itemsInDiagonal; j++) {
//        rowIndex = (length - 1) - j;
//        columnIndex = (i - length) + j;
//        items.append(twoDArray[rowIndex][columnIndex]);
//    }
//}


// n= # of rows and columns

// calculate the absolute difference Math.abs()
//clear counters

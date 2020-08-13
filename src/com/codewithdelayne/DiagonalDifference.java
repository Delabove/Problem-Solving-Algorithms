package com.codewithdelayne;

import java.util.*;


public class DiagonalDifference {
    public static List<List<Integer>> diagonalDifference(List<List<Integer>> arr) {

        // Iterate the 2D list
        // and print each element
        System.out.println("[");

        for (List<Integer> primary : arr) {
            System.out.print("  [");

            for (Integer index : primary) {
                System.out.print("  "
                        + index
                        + ", ");
            }
            System.out.println("], ");
        }
        System.out.println("]");
        return arr;
    }

    // Iterate the 2D list using Iterator
    // and print each element
    public static <Integer> void
    iterateUsingIterator(List<List<Integer>> arr) {
        // Iterator for the 2D list
        Iterator listOfListsIterator
                = arr.iterator();

        System.out.println("[");
        while (listOfListsIterator.hasNext()) {

            // Type cast next() method
            // to convert from Object to List<K>
            List<Integer> list = new ArrayList<Integer>();

            list = (List<Integer>) listOfListsIterator.next();

            // Iterator for list
            Iterator eachListIterator
                    = list.iterator();

            System.out.print("  [");
            while (eachListIterator.hasNext()) {

                System.out.print(
                        "  "
                                + eachListIterator.next()
                                + ", ");
            }
            System.out.println("], ");
        }
        System.out.println("]");
    }

    public static void main(String[] args) {

//        {11, 2, 4, 4 ,5, 6, 10, 8, -12};

        // List of Lists
        ArrayList<List<Integer>> arr
                = new ArrayList<List<Integer>>();

        // Create N lists one by one
        // and append to the list of lists
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
        for (int i = 0; i < arr.size(); i++)
        {
            for (int j = 0; (arr.get(i) != null && j < arr.get(i).size()); j++)
                System.out.print(arr.get(i).get(j) + " ");

            System.out.println();
        }
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

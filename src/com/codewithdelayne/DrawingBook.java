package com.codewithdelayne;

public class DrawingBook {

    static int pageCount(int n, int p) {


        int totalPageTurnCountFromFront = n / 2;
        int targetPageTurnCountFromFront = p / 2;
        int targetPageTurnCountFromBack = totalPageTurnCountFromFront - targetPageTurnCountFromFront;

        return Math.min(targetPageTurnCountFromFront, targetPageTurnCountFromBack);

    }

    public static void main(String[] args) {
        System.out.println(pageCount(6, 2));
    }

}
//          Question Analysis

//
// page 1 is always on the right side:
// When she flips page 1, she sees pages 2 and 3.
// Each page except the last page will always be printed on both sides.
//
//  If  n pages long, && she wants to turn to page p,
//  what is the minimum number of pages she will turn
//
// find and print the minimum number of pages Brie must turn in order to arrive at page p.
//
//  pageCount has the following parameter(s):
//
//  n: the number of pages in the book
//  p: the page number to turn to
//
//
//      Sample Input 0              Sample Output 0
//
//
//           n=  6                          1
//           p=  2
//
//
// 1 turn = two pages
//

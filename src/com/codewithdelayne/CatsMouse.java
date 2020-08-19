package com.codewithdelayne;

public class CatsMouse {

    static String catAndMouse(int x, int y, int z) {
        int [] catAndMouse = new int[]{x,y,z};
        int distanceA = Math.abs(x-z);
        int distanceB = Math.abs(y-z);

        String winner = " ";

        for(int i = 0; i < catAndMouse.length; i++){
            if(distanceA < distanceB){
                winner = "Cat A";
            }
           if(distanceA > distanceB){
               winner = "Cat B";
           } else if(distanceA == distanceB){
              winner = "Mouse C";
           }
        }
        return winner;
    }

    public static void main(String[] args) {
        System.out.println(catAndMouse(1,2,3));
    }
}

//      Question Analysis

//
// given: their starting positions
//
// task: determine which cat will reach the mouse first, assuming the mouse doesn't move and the cats travel at equal speed.
// If the cats arrive at the same time, the mouse will be allowed to move and it will escape while they fight.
//
// You are given q queries in the form of x, y, and z representing the respective positions for cats A and B, and for mouse C.
//
//  If cat A catches the mouse first, print Cat A.
//  If cat B catches the mouse first, print Cat B.
//  If both cats reach the mouse at the same time, print Mouse C as the two cats fight and mouse escapes.

//  Sample Input 0
//
//  2 ->number of queries
//  1 2 3  (cat A's location),  (cat B's location), and  (mouse C's location).
//  1 3 2

// create array to index cat's and mouse position
// loop through to find given location
// if distance between A & C is < B
// print Cat A
// if distance between A & C is > B
// print Cat B
// if distance of A from C is == distance of B from C
// print Mouse C

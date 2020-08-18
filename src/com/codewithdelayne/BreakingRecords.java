package com.codewithdelayne;

import java.util.Arrays;

public class BreakingRecords {
    // iterate through (games) index
    // locate game[i] score
    // compare to highest
    // if higher than highest
    // highest++
    // if lower than lowest
    // lowest++
    //
    static int[] breakingRecords(int[] scores) {

        int[] highLow = new int[2];
        int highestScore = scores[0] ;
        int highCount = 0;
        int lowestScore = scores[0];
        int lowCount = 0;

        for (int i = 1; i<scores.length; i++){
            if (scores[i] == 0){
                return highLow;
            }

            if(scores[i] > highestScore){
                highestScore= scores[i];
                highLow[0]++;
            }
            if(scores[i] < lowestScore){
                lowestScore = scores[i];
                highLow[1]++;
            }
        }


        return highLow;

    }

    public static void main(String[] args) {
        int[] scores = new int[] {10, 5, 20, 20, 4, 5, 2, 25, 1};
        System.out.println(Arrays.toString(breakingRecords(scores)));
    }




}
//
//      Question Analysis
//
//  scores for the season: scores =[12,24,10,24], ordered/sorted
//
//                                           Count
//         Game  Score  Minimum  Maximum   Min Max
//          0      12     12       12       0   0
//          1      24     12       24       0   1
//          2      10     10       24       1   1
//          3      24     10       24       1   1
//
// Task: numbers of times her best (highest) score increased and her worst (lowest) score decreased.
//
//
// Function Description:
// Return integer array containing # of times broke record
//
// [0]= breaking most points records
// [1]= breaking least points records
//
//  # of games: 9
//  Game score: 10 5 20 20 4 5 2 25 1
//
//
// iterate through (games) index
// locate game[i] score
// compare to highest
// if higher than highest
// highest++
// if lower than lowest
// lowest++
//



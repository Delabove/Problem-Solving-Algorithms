package com.codewithdelayne;

import java.util.ArrayList;
import java.util.List;

public class MigratoryBirds {


// loop through arr
// if arr[i] appears more than once
// store number in a temporary integer
// add 1 to counter for every occurrence
// if another arr[i] occurs more than once
//  store in temporary integer
//  count
// if count > previous occurence
// add new number to most common integer
// if more than 1 int == the same occurence, return the lowest of the two numbers
//



    static int migratoryBirds(List<Integer> arr) {
        int count = 0;
        int mostCommon = 0;
        int[] birdCountArr = new int[6];


        for(int i = 0; i<arr.size();i++){
            birdCountArr[arr.get(i)]++;
        }

         for(int i = 1; i < birdCountArr.length; i++){
         if(birdCountArr[i] > count){
            count = birdCountArr[i];
            mostCommon = i;


        }

    } return mostCommon;

    }

    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.add(4);
        arr.add(3);
        arr.add(2);
        arr.add(1);
        arr.add(3);
        arr.add(4);


        System.out.println(migratoryBirds(arr));

    }

}

//              Question Analysis

// arrayList = sightings
// number = type of bird
//

//
// func descr: return the lowest type number of the most frequently sighted bird.
//      param: arr -int representing types of birds sighted
//
// input
// # of birds sighted and reported in arr                 6
// type # of each bird sighted                            1 4 4 4 5 3
// output
// Print the type number of the most common bird;
// if two or more types of birds are equally common,        4
// choose the type with the smallest ID number.
//
//
// loop through arr
// if arr[i] appears more than once
// store number in a temporary integer
// add 1 to counter for every occurrence
// if another arr[i] occurs more than once
//  store in temporary integer
//  count
// if count > previous occurence
// add new number to most common integer
// if more than 1 int == the same occurence, return the lowest of the two numbers
//

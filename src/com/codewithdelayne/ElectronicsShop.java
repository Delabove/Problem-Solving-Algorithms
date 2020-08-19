package com.codewithdelayne;

public class ElectronicsShop {

// loop through both arrays
// add k[i] + d[i]
// if(k[i] + d[i] < 60 && k[i] + d[i] > maxTotal)
// store maxTotal
// print maximum total
// if(k[i] + d[i] >= 60)
// print -1

    static int getMoneySpent(int[] keyboards, int[] drives, int b) {
    int maxTotal = 0;
    int sum = 0;

    for (int i = 0; i < keyboards.length; i++){
        for (int j = 0; j < drives.length; j++){
            sum = keyboards[i] + drives[j];
            if(sum <= b && sum > maxTotal){
                maxTotal= sum;
            } else if (sum > b && maxTotal == 0){
              maxTotal= -1;
            }
        }
    }
    return maxTotal;
    }

    public static void main(String[] args) {
        int[] keyboards = new int[]{4};
        int[] drives = new int[]{5};
        System.out.println(getMoneySpent(keyboards, drives, 5));
    }

}

//      Question Analysis
//
//
// Given: drives, keyboards = price lists and b= budget
//  Task: find and print the amount of money Monica will spend
//
//  doesn't have enough money = print -1
//
//  It should return the maximum total price for the two items budget, or
//  -1 if she cannot afford both items.
//
//
//  Input
//  10 2 3       budget, # keyboard and # drive
//  3 1          prices of each keyboard model
//  5 2 8        prices of the USB drives
//
//
// Output
// 9            amount of money Monica will spend

// keyboards=[40, 50, 60]
// drives=[5, 8, 12]
//
// 2 items < 60

// algorithm

// loop through both arrays
// add k[i] + d[i]
// if(k[i] + d[i] < 60 && k[i] + d[i] > maxTotal)
// store maxTotal
// print maximum total
// if(k[i] + d[i] >= 60)
// print -1

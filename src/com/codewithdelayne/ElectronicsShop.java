package com.codewithdelayne;

public class ElectronicsShop {
    static int getMoneySpent(int[] keyboards, int[] drives, int b) {
    int totalMax = 0;

    return totalMax;
    }

    public static void main(String[] args) {
        int[] keyboards = new int[]{3, 1};
        int[] drives = new int[]{5, 2, 8};
        System.out.println(getMoneySpent(keyboards, drives, 10));
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
//
// loop through both arrays
// add k[i] + d[i]
// if(k[i] + d[i] < 60 && k[i] + d[i] > maxTotal)
// store maxTotal
// print maximum total
// if(k[i] + d[i] >= 60)
// print -1

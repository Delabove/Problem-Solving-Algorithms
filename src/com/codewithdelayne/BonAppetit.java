package com.codewithdelayne;

import java.util.ArrayList;
import java.util.List;

public class BonAppetit {

// loop through the bill to find k
// subtract k from bill
// add remaining elements and divide sum by 2
// compare the cost of bill with amt charged
// if charged == cost
// print bon apetite
// else subtract charged - cost
// print remainder

    static void bonAppetit(List<Integer> bill, int k, int b) {

        int totalCost = 0;
        int refund = 0;

        for(int i = 0; i < bill.size(); i++){
            if(i == k){
                totalCost = totalCost - bill.get(i);
            }
        }

        if(totalCost != b){
           refund= b - totalCost;
            System.out.println(refund);
        } else{
            System.out.println("Bon Apetite!");

        }


    }

    public static void main(String[] args) {
        List <Integer> bill = new ArrayList<>();
        bill.add(3);
        bill.add(10);
        bill.add(2);
        bill.add(9);

       bonAppetit(bill, 1,7);

    }
}

//                      Question Analysis
//
//  determine if his calculation is correct
//  print Bon Appetit if the bill is fairly split
//  Otherwise, it should print the integer amount of money that Brian owes Anna.
//
//  example
//
//  bill=[2,4,6]
// k = bill[2]  cost= $6   -declines
//
// if excludes cost: will pay [2 + 4]/2 = 3 (anna's cost if calculated correctly)
//
// if includes cost: will pay [2 + 4 + 6]/2 = 6 (anna's cost if calculated incorrectly)
// if incorrect refund the difference
//
//  bonAppetit has the following parameter(s):
//
//  bill: an array of integers representing the cost of each item ordered
//  k: an integer representing the zero-based index of the item Anna doesn't eat
//  b: the amount of money that Anna contributed to the bill

//      input                                                                               output

// # ordered ->         n= 4 k= 1           <- index of item she didn't eat                     5
//   bill[i]            3, 10, 2, 9            0<= i < n
//   amount charged     12

//      Algorithm

// loop through the bill to find k
// subtract k from bill
// add remaining elements and divide sum by 2
// compare the cost of bill with amt charged
// if charged == cost
// print bon apetite
// else subtract charged - cost
// print remainder
package com.codewithdelayne;



public class VeryBigSum {

    // Complete the aVeryBigSum function below.
    static long aVeryBigSum(long[] ar) {

       long sum=0;
        for(int i=0;i<ar.length;i++)
        {
            sum=sum+ar[i];
        }
        return sum;
    }


    public static void main(String[] args) {
    long[] ar = new long[]{1000000001, 1000000002,100000003, 100000004, 100000005};
   System.out.println( aVeryBigSum(ar));

    }

}

//calculate sum of elements
//print sum of elements
// long
//
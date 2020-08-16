package com.codewithdelayne;

public class TimeConversion {

    static String timeConversion(String s) {
        // Split the string by :
        String[] sTime = s.split(":");

        int x = 0;

        // if PM and hours >12, add additional 12 to hours
        // for AM and hour = 12, set hour to 00
        if(sTime[sTime.length - 1].contains("PM") && !sTime[0].equals("12"))
            x = 12;

        String val1 = "";
        if(x == 12)
            val1 = (Integer.parseInt(sTime[0]) + x) + "";
        else {
            if(sTime[0].equals("12") && sTime[sTime.length - 1].contains("AM"))
                val1 = "00";
            else
                val1 = sTime[0];
        }

        // merge the string and return the result
        String result = val1 + ":" + sTime[1] + ":" + sTime[2].substring(0,2);
        return result;
    }

    public static void main(String[] args) {
    String s = new String("07:05:45PM");

        System.out.println(timeConversion(s));
    }
}


//      Question Analysis

// Given a time in 12-hour AM/PM format, convert to
// military time

//function description:
// return a new string representing the input time in 24 hour format.

// parameter:
// a string representing time in 12 hour format

//input: 12hour 01<=hh<=12 and 00<=mm,ss<=59
//output: 24hour 00<=hh<=23
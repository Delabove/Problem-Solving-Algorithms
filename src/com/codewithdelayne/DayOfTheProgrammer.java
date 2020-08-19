package com.codewithdelayne;

public class DayOfTheProgrammer {
    static String dayOfProgrammer(int year) {

        String date = "";
        if(year < 1918) {                                                   //Julian check for leap year
            date += (year % 4 == 0) ? "12.09." + year : "13.09." + year;
        } else if(year == 1918) {                                           //Special case: transition year
            date += "26.09." + year;
        } else {                                                            //Gregorian check for leap year
            date += ((year % 400 == 0) ||
                    (year % 4 == 0 && year % 100 != 0)) ? "12.09." + year : "13.09." + year;
        }
        return date;
    }



    public static void main(String[] args) {
        System.out.println(dayOfProgrammer(2017));
    }
}





//          QUESTION ANALYSIS

//
//
// inclusive range from 1700 to 2700
//
//
//Given a year, y
// find the date of the 256th according to the official Russian calendar during that year.
//  print it in the format dd.mm.yyyy, where dd is the two-digit day, mm is the two-digit month, and yyyy is .
//
//  In the Julian calendar, leap years are divisible by 4;
//  in 1918,
//
//
// check if y % 4 == 0
// if so,
//
// Ex 0
// In the year 2017, January has 31 days, February has 28 days, March has 31 days, April has 30 days,
// May has  days, June has 30 days, July has 31 days, and August has  31days. When we sum the total
// number of days in the first eight months, we get . Day of the Programmer is the  day, so
// then calculate  to determine that it falls on day  of the  month (September). We then
// print the full date in the specified format, which is 13.09.2017.

//  sum the total number of days in the first eight months (243)
//  Day of the Programmer is the 256 day
//  then calculate 256-243=13
//  to determine that it falls on day 13 of the 9th month
//  then print the full date in the specified format, which is 13.09.2017.
//
//
// Ex 1
//
//  Year y=2016  is a leap year,  so February has 29 days but all the other months have the same number of days as in 2017.
//  (243+1)
//  Day of the Programmer is the 256 day
//  then calculate 256-244=12
//  to determine that it falls on day 12 of the 9th month
//  then print the full date in the specified format, which is 12.09.2016.
//
//
// Algorithm

// if y % 4 == 0
//  sout 12.09. + y
//
// if y % 4 != 0
// sout 13.09. + y
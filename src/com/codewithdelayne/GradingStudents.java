package com.codewithdelayne;
import java.util.ArrayList;
import java.util.List;



public class GradingStudents {

//      Algorithm
// 1. multOf5 = find next multiple of 5 algo
// 2. subtract grade[i] by multOf5
// 3. round= Math.round to multOf5 algo
// 3. compare:
//      if < 3, round(grade[i])
//      if = 3, no rounding
//      if grade <= 38, no rounding
// 4. insert rounded grades into a new arrayList
// 5. print rounded grades array

    public static List<Integer> gradingStudents(List<Integer> grades) {
       List<Integer> roundedGrades = new ArrayList<>();
        int n = grades.size(); //# of students grades
        int i = 0;
        int round = (n/5) * 5 + 5; //larger multiple
        int nextMultiple= grades.get(i) + 5;

        for (i=0; i<grades.size(); i++){

            if (  < 3){

            }
        }


       return roundedGrades;
    }

    public static void main(String[] args) {
        List<Integer> grades = new ArrayList<>();
        grades.add(73);
        grades.add(67);
        grades.add(38);
        grades.add(33);

        System.out.println(gradingStudents(grades));

    }
}

//      Question Analysis

//Grading policy:
//grade range 0 to 100 inclusive
//grade<40 = failing

//sams:
// if difference of grade and multiple of 5 < 3, round grade to next multiple of 5
// if value of grade is < 38, no rounding

//given: array with grade values for each student
//task: automate rounding process

//function description: integer array of rounded grades
// param: grades array before rounding

//     input                     output              constraints
// n = #/students               for each            1<= n <= 60
// each line i of the           grades[i]           0<= grades[i] <=100
// n subsequent lines           print rounded
// grades [i] =                 grade on new
// student i's grade            line

// sample input:                sample output

// 4
//73                                 75
//67                                 67
//38                                 40
//33                                 33



// Student 1 received a 73, and the next multiple of 5 from 73 is 75. Since 75-73 < 3 , the student's grade is rounded to 75.
// Student 2 received a 67, and the next multiple of 5 from 67 is 70. Since 70-67=3 , the grade will not be modified and the student's final grade is 67.
// Student 3 received a 38, and the next multiple of 5 from 38 is 40. Since 40-38 < 3, the student's grade will be rounded to 40.
// Student 4 received a grade below 38, so the grade will not be modified and the student's final grade is 33.

//      Algorithm
// 1. multOf5 = find next multiple of 5 algo
// 2. subtract grade[i] by multOf5
// 3. round= Math.round to multOf5 algo
// 3. compare:
//      if < 3, round(grade[i])
//      if = 3, no rounding
//      if grade <= 38, no rounding
// 4. insert rounded grades into a new arrayList
// 5. print rounded grades array
//
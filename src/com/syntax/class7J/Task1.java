package com.syntax.class7J;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter  your birth month");
		String month = scan.next();
		String season=null;

		if (month.equals("April") || month.equals("March") || month.equals("May")) {
			season = "spring";
		} else if (month.equals("June ") || month.equals("July") || month.equals("August")) {
			season = "Summer";
		}

		else if (month.equals("September") || month.equals("October") || month.equals("November"))

		{
			season = "fall";

		}
		else {season="Invalid";}
		System.out.println("You were born is season "+ season);
		
		

				        /*
				Write a program that will read three inputs of scores (quiz, mid term, and final scores) and determine the grade based on the following rules: 
				if the average score >=90 → grade=A
				if the average score >= 70 and <90 → grade=B
				if the average score>=50 and <70 → grade=C
				if the average score<50 → grade=F
				         */
				        
				        System.out.println("Please Enter your Quiz Score?");
				        double quiz = scan.nextDouble();
				        System.out.println("Please Enter your mid term Score?");
				        double midterm = scan.nextDouble();
				        System.out.println("Please Enter your Final Score?");
				        double finall = scan.nextDouble();
				        double average;
				        String grade =;// when we do not have else conditon add null

				        average = (quiz+midterm+finall)/3;

				        if(average>=90 && average<=100) {
				            grade = "A";
				        }else if(average>=70 && average<90) {
				            grade = "B";
				        }else if(average>=50 && average<70) {
				            grade = "C";
				        }else if(average<50) {
				            grade = "F";
				        }else {
				            System.out.println("Please enter valid score!");
				            grade ="None";
				        }
				        System.out.println("Grade: "+grade);





				    }

				}

	}

}

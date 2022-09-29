package com.syntax.class6J;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		System.out.println("Please eneter your height");

		double h = scan.nextDouble();
		if (h < 60) {
			System.out.println("short");

		} else if (h >= 60 && h < 72) {
			System.out.println("medium");

		} else if (h > 72) {
			System.out.println("tall");
		}

		System.out.println("Please enter the day number of the week");
		int day = scan.nextInt();
		if (day <= 5) {
			System.out.println("It is a weekday");
		} else if (day == 6 || day == 7) {
			System.out.println("it is weekend");
		} else {
			System.out.println("invalid day number");
		}
		  System.out.println("Please enter a number");
		  double num=scan.nextDouble();
		  if(num>1 && num<10)
		  {System.out.println("small");
		  
		  }
		  else if (num>11 && num<100)
 {System.out.println("medium");
		  
		  }
		  else if (num>101 && num>1000)
 {System.out.println("large");
		  
		  }
			  
		
		
		
		
		
	}

}

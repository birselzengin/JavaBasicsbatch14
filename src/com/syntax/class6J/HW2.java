package com.syntax.class6J;

import java.util.Scanner;

public class HW2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		System.out.println("what time is it?(Please use 24 hour format)");
		double time = scan.nextDouble();

		if (time > 1 && time < 11) {
			System.out.println("Morning");
		} else if (time > 12 && time < 15) {
			System.out.println("Morning");
		} else if (time > 16 && time < 20) {
			System.out.println("Afternoon");
		} else if (time > 21 && time < 24) {
			System.out.println("Night");
		}
		
		
		System.out.println("Please enter  your birth month");
		String month = scan.next();
		if (month.equals("April") || month.equals("March") || month.equals("May")) {
			System.out.println("spring");
		} else if (month.equals("June ") || month.equals("July") || month.equals("August")) {
			System.out.println("Summer");
		}
	
		else if(month.equals("September")|| month.equals("October")|| month.equals("November"))
		
		{
		System.out.println("season=fall");
		
	}
	
	
	
	}

}
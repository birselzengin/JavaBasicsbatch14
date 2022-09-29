package com.syntax.class6J;

import java.util.Scanner;

public class HW {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		
		
		
	Scanner scan=new Scanner(System.in);
	System.out.println("do you have credit card?");
	boolean result=scan.nextBoolean();
	if (result)
	{
		
		System.out.println("what is balance?");
		int balance=scan.nextInt();
		if(balance>100) {
			
			System.out.println("pay");
		}else {System.out.println("spend more");}}
		else
			{System.out.println("great offer have");}
		}
	}



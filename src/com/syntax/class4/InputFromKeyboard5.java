package com.syntax.class4;

import java.util.Scanner;

public class InputFromKeyboard5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner=new Scanner(System.in);
				System.out.println("Did you solve any Repl Assignment Please enter True or False");
		boolean solvedAnyRepls=scanner.nextBoolean();
		if(solvedAnyRepls)
		{
		System.out.println("How many Repls you solved");
		int noOfReplsSolved=scanner.nextInt();
		
		
		if (noOfReplsSolved>=17)
		{System.out.println("you are doing great");
		
		
		
		}
		else if (noOfReplsSolved>10);
		
		{System.out.println("you are doing okay Please complete ");
		
		}
		
		 
		{	
			System.out.println("you should solve more repls");
		}
		}
		else 
			
		{
			System.out.println("they are very impostant");
		
		}
		
		}
}

package com.syntax.class9;

public class ForEachLoop {

	public static void main(String[] args) {

		String[] iceCream= {" muzlu", "cikolata", "sade"};
		for(String flovar:iceCream) {
			System.out.println(flovar);
		}
		 System.out.println("-------------");
		
		
		 char [] letters= { 'A', 'B', 'C', 'D','F'	};
		 for (char letter:letters) {
			 System.out.print(letter+" ");
		 }
		System.out.println("------------------");
		
		int[] numbers= {12,56,345,1,0,9};
		//get the all using for loop
		for (int i=0; i<numbers.length; i++) {
			System.out.print(numbers[i]+" ");
		}
		
		// get all values using enhanced for loop 
		for (int num:numbers) {
			System.out.print(num+" ");
		}
		
	}

}

package com.syntax.class2;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
String name1="Birsel";
		
		String lastname="Zengin";
		String grade="7th";
		String city="odessa";
		String state="texas";
		String phone1="123 345 7878";
		
		System.out.println("My name is" + name1 +" and my last name is " +lastname);
		System.out.println("I am a " +grade +" grade student. " );
		System.out.println("I live in "+ city );
		System.out.println("And my phone number is "+phone1);
		
		//updates 
		
		grade="8th";
		city="Dallas";
		phone1="123 478 9090";
		
		System.out.println("My name is " + name1);
		System.out.print("Now I am  " +grade +" grade student. " );
		System.out.print("I moved to "+ city+'.' );
		System.out.println("And new my phone number is "+phone1+'.');
		
		

	}

}

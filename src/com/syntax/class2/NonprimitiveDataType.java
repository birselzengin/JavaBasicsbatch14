package com.syntax.class2;

public class NonprimitiveDataType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		//string is just 1 example
		
		String name="Asma";
		String address="123 address street";
		
		String phone="123 456 7890";
		int age=17;
		//string age="17"; //anything inside ""-> become string
		
		
		//ctr+space-> auto completes the statement 
		//syso+ctrl+space
		System.out.println(name);
		//"My name is " + Asma
		System.out.println("My name is "+   name);
		
		// Asma is 17
		System.out.println(name + " is " +age);
		
		String fruit="apple";
		double price=1.99;
		
		System.out.println("The price of the "+fruit+" is " +price );
		
		fruit="mango";
		price=5.99;
		System.out.println("The price of the "+fruit+" is " +price );
		
		/* to attach any value(int, double, boolean, char, string etc)
		 * to a string we use +
		 * + to next to the string acts as Concatenation 
		 * 
		 */
		
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
		
		grade="8th";
		city="Dallas";
		phone1="123 478 9090";
		
		System.out.println("My name is " + name1 +" and my last name is " +lastname);
		System.out.println("Now I am  " +grade +" grade student. " );
		System.out.println("I moved to "+ city+'.' );
		System.out.println("And new my phone number is "+phone1+'.');
		
		
		
		
				
		
		
	}

}

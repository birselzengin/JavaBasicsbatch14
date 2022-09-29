package com.syntax.class9;

public class Task1 {

	public static void main(String[] args) {
	
		
		String[] drinks= { "fanta", "milk", "juice", "lemonade"};
		System.out.println(drinks[2]);
		
		//how many elements inside an array?
	int size 	=drinks.length;// will give # of elements in the array
	System.out.println("Size of array="+size);
		/*Create an array of chars and store grades into it: A,B,C,D,E,F. Then print a grade B (use 2 different ways of creating an array).

Create an array of names and store all names of your group. Then print your name from that array. (use 2 different ways of creating an array).

Create an array of words: Java, Saturday, day, coding, is. Print the following sentence using elements of array: “Saturday is Java coding Day”.
		 * 
		 */
char[] grades= {'A','B','C','D','E','F'};
System.out.println(grades[1]);

String[] names=new String[5];
names[0]="ask";
		names[1]="birsel";
		names[2]="biro";
		names[3]="mero";
		names[4]="muhammed";
		System.out.println( names[1]);
		
String[] name= {"ask", "birsel", "emo", "mero", "muhammed"};
System.out.println(names[2]);
String[] words= {"Java", "Saturday", "day.", "coding", "is"};
System.out.println(words[1]+" "+words[4]+" "+words[0]+" "+words[3]+" "+ words[2]);
	
	
	
	
	}

}

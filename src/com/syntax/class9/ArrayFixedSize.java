package com.syntax.class9;

public class ArrayFixedSize {

	public static void main(String[] args) {
		int [] nums=new int[3];
		
		nums[1]=12;
		nums[2]=13;
System.out.println(nums[0]);// waste of space we print default which is 0

           String[]   colors=new String[3];
           colors[0]="white";
           colors[1]="pink";
           colors[2]="black";
        		   colors[3]="yellow"; // we store more than we said it should be 3 but we have 4 colors store 
        		   //java.lang.ArrayIndexOutOfBoundsException: this is an error
          


	}
 
}

package com.syntax.class9;

public class ArrayDemo {

	public static void main(String[] args) {
		
		
		int[] arr=new int[4];
		// store elements inside an array
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		arr[3]=40;
		
		//access
		System.out.println(arr[2]);// 30 will print
		System.out.println(arr[1]+arr[2]);
		
		
		//lets store classmates
		String[] names=new String[5];
		names[0]="Ali";
				names[1]="emo";
				names[2]="biro";
				names[3]="mero";
				names[4]="muhammed";
				System.out.println("hello "+ names[1]);
				

	}

}

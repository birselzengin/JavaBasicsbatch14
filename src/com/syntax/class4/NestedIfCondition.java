package com.syntax.class4;

public class NestedIfCondition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int time = 5;
		String day = "Monday";
// outer 
		if (day.equals("Monday")) // as String is  a non pirimitive we cnnot use ==sign

		{
			
			//inner  if-condition
			if (time > 7) {
				System.out.println("Lets go to office");
			}

			if (time < 6) {
				System.out.println("Lets sleep more");
			}

		}

	}

}

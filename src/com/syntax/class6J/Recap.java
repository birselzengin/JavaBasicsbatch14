package com.syntax.class6J;

import java.util.Scanner;//ctrl+shift+O

public class Recap {

	public static void main(String[] args) {
		{

			// shortcut crtl+space autocomlete main ctl+space

			Scanner input = new Scanner(System.in);
			System.out.println("Please enter your name");

			// to capture different values, we need to use different options
			String name = input.next();// capturing String
			System.out.println("Nice to meet you " + name);

			System.out.println("How old are you? " + name);
			int age = input.nextInt();// capuring int
			System.out.println(name + " is " + age + " years old");

			System.out.println("How much money you have? " + name);
			double money = input.nextDouble();
			System.out.println(name + " has $ " + money);

			System.out.println(name + " what is your grade?");
			char grade = input.next().charAt(0);//can change 0 to 1 then second leter will print
			
			System.out.println(name + " has grade " + grade);

			System.out.println("End");

		}

	}

}

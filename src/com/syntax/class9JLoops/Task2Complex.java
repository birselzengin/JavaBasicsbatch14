package com.syntax.class9JLoops;

import java.util.Scanner;

public class Task2Complex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner scanner = new Scanner(System.in);
        System.out.println("What would you like to buy? ");
        String item = scanner.nextLine();
        System.out.println("How much does it cost?");
        double price = scanner.nextDouble();
        double money;
        double total = 0;
        do {
        System.out.print("How much money do you have? ");
        money= scanner.nextDouble();
        total+=money;
        double need;
        double change;
        if(total<price) {
            need=price-total;
            System.out.println("You need to pay more"+need);
        }
        else if (total>price) {
            change=total-price;
            System.out.println("Here is your change "+change);
        }
    }while (total!=price);
        System.out.println("Thank you for shopping");

    
    

	}

}

package com.syntax.class7J;

import java.util.Scanner;

public class SwitchDemo3 {

	public static void main(String[] args) {
       Scanner in=new Scanner(System.in);
       System.out.println("where are you from?");
       String country=in.nextLine();
       String favoriteFood;
       switch(country)
       {
       case"USA":
    	   favoriteFood="burgers and fries";
    	   break;
       case"Kazakhstan":
    	   favoriteFood="beshparmak";
    	   break;
    	   
       case"Turkey":
       favoriteFood="adana kebab";
       break;
       case"Venezuela":
    	   favoriteFood="Arepa";
    	   break;
       case"yemen":
    	   favoriteFood="Mandi";
    	   break;
    	   default:
    	  
        	   favoriteFood="Unknown";
        	   break;
       
       }
       System.out.println("you are from "+ country +" and your favorite food is "+ favoriteFood);
       
       
	}
	}



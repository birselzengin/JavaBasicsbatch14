package com.syntax.class7J;

public class LogicalNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       boolean boo=!true;
     System.out.println(boo);//true

           boolean rain=true;
           if (!rain)// since it reverse to false we cannot open the door
        		   
     {System.out.println("i will go for a walk");
     
     }
           {System.out.println("end");
           
           }
     String day="Sunday";
     if (!day.equals("Sunday"))
     { System.out.println("Today is not Sunday");
     }
   

     System.out.println(" ------------------  ");

     boolean checkboxSelected = false;

     if (!checkboxSelected) {
         System.out.println("I will click and select it");
     }

     System.out.println("End of the program");

	}

}

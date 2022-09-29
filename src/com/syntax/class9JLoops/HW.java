package com.syntax.class9JLoops;

public class HW {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[] num = {10,90,60,80};
        int largestNum=0;

        for(int i=1 ; i<num.length; i++) {
        if(num[i]>largestNum) {
            largestNum=num[i]; //store the  num elements in largestNum
            }
    }
        System.out.println("The largest num among the array elements is " + largestNum + "!");
        
        
        
        
        System.out.println("==============================");
        int[] numbers= {5,29,46,93,135};

        System.out.println(numbers[0]+numbers[1]+numbers[2]+numbers[3]+numbers[4]);


        System.out.println("-----------------------------------------");
        int sum = 0;

        for(int i=0; i<numbers.length; i++) {
            sum+=numbers[i];

        }
        System.out.println("The sum is "+sum);
        
        System.out.println("===================");
        
        
        char[] letters= {'A', 'D', 'F', 'T', 'N'};

        for(int i=letters.length-1; i>=0; i--) {
            System.out.print(letters[i]+" ");


    }
System.out.println("==============");
String[] week= {"Monday", "Sunday","Tuesday", "Thursday", "Friday"};

// if day is Sunday -> it is fun day 
// otherwise - it is a boring day

for(String day:week) {

    if(day.equals("Sunday")) {
        System.out.println(day+" is a fun day");

    }else if(day.equals("Friday")) {
        System.out.println(day+" is a relax day");

    }else {
        System.out.println(day+" is a boring day");
    }
}

	
	
	
	}

	}



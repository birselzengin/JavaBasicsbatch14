package com.syntax.class7J;

public class SwirchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//matching cases must  of same data type as a variable
		char choice = 'Y';
		String answer;
		

		switch (choice) {

		case 'Y':
			answer = "Yes";
			break;
		case 'N':
			answer = "No";
			break;
		case 'M':
			answer = "Maybe";
			break;
		default:
			answer = "Unknown";
			break;
		}


		System.out.println(answer);
//Limitations of switch case cannot use logical operators
		//cannot use relation operators
		//cannot work with boolean values
		//cannot work with float/double and long
		/* CANNOT work with boolean values
        * CE: Cannot switch on a value of type boolean.
        * boolean boo=true;

           switch(boo) {

           }

           CANNOT work with float/double and long
        */
	}

}

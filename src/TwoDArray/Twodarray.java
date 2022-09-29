package TwoDArray;

public class Twodarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		
		
		
		
		
		
		
		
		
		 //[row][col]
        int[][] bigArray=new int[3][4];
        //1 row
        bigArray[0][0]=10;
        bigArray[0][1]=20;
        bigArray[0][2]=30;
        bigArray[0][3]=40;
        //2 row
        bigArray[1][0]=100;
        bigArray[1][1]=200;
        bigArray[1][2]=300;
        bigArray[1][3]=400;
        //3 row
        bigArray[2][0]=1;
        bigArray[2][1]=2;
        bigArray[2][2]=3;
        bigArray[2][3]=4;

        // how to access elements from 2d array?
        System.out.println(bigArray[1][2]); //300

        String[][] bigArr=new String[2][4];
        //1 row
        bigArr[0][0]=
        //2 row
        bigArr[1][0]="Smith";
        bigArr[1][1]="Jordan";
        bigArr[1][2]="Jackson";
        bigArr[1][3]="Obama";
        System.out.println(bigArr[0][1]+" "+bigArr[1][0]+","+bigArr[0][0]+" "+bigArr[1][3]+","+bigArr[0][3]+" "+bigArr[1][2]+","+bigArr[0][2]+" "+bigArr[1][1]+".");
       
	//String:
       // Mrs Smith, Mr Obama, Ms Jackson, Miss Jordan.

        System.out.println("=============");
        String [][] Arr= {
        		{"Mr.", "Mrs.","Miss.", "Ms."},
        		{"Smith","Jordan","Jackson","Obama"}
                    
                   
                };
       
        		
        
        
        System.out.println("================");
        
        
        
        
        String[][] arr= {

                {"Yusuf", "Hamza", "Adam", "John"},
                {"A", "B", "C", "D"}
        };

        System.out.println(arr[0][0]+"="+arr[1][0]);
        System.out.println(arr[0][1]+"="+arr[1][1]);
        System.out.println(arr[0][2]+"="+arr[1][2]);
        System.out.println(arr[0][3]+"="+arr[1][3]);

	
	System.out.println("==============");
	
	
	
	}

	
	}



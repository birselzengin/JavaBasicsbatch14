package Class12;



public class dog {
	// state/attributes/fields/properties
	String name;
	String color;
	String breed;
	double weight;
	int age;
	
	
	//behaviors use void
	  void bark () {
		  System.out.println("Barking ............");
	  }
	  
	  void sleep() {
		  
		  
		  System.out.println("Dog is sleeping..........");}
		  
		 public static void main(String[] args) {
			 
			 
			 //creating objects from a class
			 //new dog ();-> it creates an object of class dog 
			 dog dog1= new dog();
			 //calling a behaver on a object
			 dog1.bark();
			 dog1.sleep();
			 
			  
		  }
	
}

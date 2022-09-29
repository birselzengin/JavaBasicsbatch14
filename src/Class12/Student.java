package Class12;

public class Student {
	
	
	String name;
	String ID;
	double weight;
	int age ;
	
	
	void study () {
		System.out.println("Students are studying");}
	
	void eat () {
		System.out.println("Students are eating pizza");}
	
	
	
	void deleteMessages() {
		System.out.println("Deleting messegaes from discord");
	}
	
	public static void main(String[] args) {
		
		//new Student() Creates the objects of the Student class
Student FriadoonObject=new Student();
FriadoonObject.name="Friadoon";
FriadoonObject.ID="123";
FriadoonObject.age=22;
System.out.println(FriadoonObject.name);
System.out.println(FriadoonObject.age);
System.out.println("==========================================");
Student student2=new Student();
student2.name="Esma";
student2.age=28;
System.out.println(student2.name);
student2.eat();




		
	}

}

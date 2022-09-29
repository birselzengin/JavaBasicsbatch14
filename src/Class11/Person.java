package Class11;

public class Person {
	
	
	String name ;
	int age;
	double weight;
	boolean isFunny;
	double height;
	boolean losingHairs;
	void study() {
		if (name.equals("Anna")) {
			System.out.println("I study hard");
		}else if (name.equals("Roman")){
			System.out.println("I will keep deleting messages and not let you study");
		} else 
		{
			System.out.println("I try to study but things do not make sense");
		}
		}

public static void main(String[] args) {
	Person person1=new Person();
	person1.name="Roman";
	person1.study();
	
	Person person2= new Person();
	person2.name="Anna";
	person2.study();
	
	
}




}



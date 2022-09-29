package Class12;
import Class12.Phone;
public class PhoneTester {

	
		public class Phone {
		    /*
		    Create a Class “Phone”. Create 3 Objects of it: iPhone, Pixel, 
		    Samsung with specific  attributes and behaviors.
		    */
		    String make;
		    String model;
		    String color;
		    int year;
		    int storage;

		    void makeCall() {
		        System.out.println("Making a call using "+model);
		    }

		    void takePictures() {
		        System.out.println("Taking picture with "+model);
		    }
		    void browseInternet() {
		        System.out.println("Browsing the internet using "+ model);
		    }

		}
		
		public static void main(String[] args) {
		        /*
		         * if class whos object we are creating
		         * is present inside the same package
		         * we don't need to import it.
		         */
		        Phone iphone=new Phone();
		        iphone.make="Apple";
		        iphone.model="Iphone 14 Pro Max";
		        iphone.year=2022;
		        iphone.storage=128;
		        iphone.makeCall();

		        //new Phone() => To Create the object
		        Phone samsungPhone=new Phone();
		        samsungPhone.model="S22 Ultra";
		        samsungPhone.make="Samsng";
		        samsungPhone.year=2022;
		        samsungPhone.makeCall();

	}

}

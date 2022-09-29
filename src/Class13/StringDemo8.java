package Class13;

public class StringDemo8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		//.replace replace good to excllence
		
		
		String str="Batch 14 is good 81247818!@##%#^ ASAKBSAKJSBN kajbjakfdnb";
        System.out.println(str.replace("good", "Excellent"));
        System.out.println(str.replaceAll("[a-z]", "#"));
        //[a-z] will change all the lowercase letter to #
	}

}

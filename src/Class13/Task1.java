package Class13;

public class Task1 {

	public static void main(String[] args) {
		String userName="user1";
				String password="pass123";
				String confirmPassword="pass123";
				if (userName.isEmpty()|| password.isEmpty())
				{System.out.println(" username and password can not be empty");

	}else if (password.length()<8) {
		System.out.println("password is too short");
	}else if (password.contains(userName)) {
		System.out.println("Pw cannot contain username");
		}else if (!password.equals(confirmPassword)) {
System.out.println("Pw do not match");}
		else {
			System.out.println("your pw and username is cretated");
		}
}
}
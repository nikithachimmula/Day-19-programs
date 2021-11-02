import java.util.Scanner;

public class ValidEmail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the valid email:");
		String email = sc.nextLine();
		String regex = "[a-z]{7}[.][a-z]{8}+@[a-z]{5}[.][a-z]{3}";
		boolean result = email.matches(regex);
		if (result) {
			System.out.println("Given Email is valid");
		} else {
			System.out.println("Given Email is invalid");
		}

	}

}

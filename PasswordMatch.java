import java.util.Scanner;

public class PasswordMatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your user name: ");
		String name = sc.nextLine();
		System.out.println("Enter your email: ");
		String email = sc.nextLine();
		// Regular expression to accept valid email id
		System.out.println("Enter your password: ");
		String password = sc.nextLine();
		String regex = "^[A-Z]{1}[a-z]{4}+@[1-5]{3}";
		boolean result = password.matches(regex);

		if (result) {
			System.out.println("Given password is valid");
		} else {
			System.out.println("Given password is invalid");
		}
	}
}

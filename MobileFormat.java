import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MobileFormat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your user name: ");
		String name = sc.nextLine();
		System.out.println("Enter your email: ");
		String email = sc.nextLine();
		// Regular expression to accept valid email id
		System.out.println("Enter your mobile number: ");
		String mobile_number = sc.nextLine();
		String regex = "[0-9]{2}\s[0-9]{10}";
		boolean result = mobile_number.matches(regex);

		if (result) {
			System.out.println("Given mobie number is valid");
		} else {
			System.out.println("Given mobie number is invalid");
		}
	}
}
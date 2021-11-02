import java.util.Scanner;

public class FirstName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the first name:");
		String first_name = sc.nextLine();
		String regex = "^[A-Z]{1}[a-z]{6}";
		boolean result = first_name.matches(regex);
		if (result) {
			System.out.println("Given first_name is valid");
		} else {
			System.out.println("Given first_name is invalid");
		}

	}

}
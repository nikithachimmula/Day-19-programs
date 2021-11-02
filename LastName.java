import java.util.Scanner;

public class LastName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the last name:");
		String last_name = sc.nextLine();
		String regex = "^[A-Z]{1}[a-z]{7}";
		boolean result = last_name.matches(regex);
		if (result) {
			System.out.println("Given first_name is valid");
		} else {
			System.out.println("Given first_name is invalid");
		}

	}

}

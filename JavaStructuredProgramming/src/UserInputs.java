import java.util.Scanner;

public class UserInputs {

	public static boolean checkInt(String input) {
		boolean isInputInt = true;
		
		for(int i = 0; i < input.length(); ++i) {
			
			if(input.charAt(i) < '0' || input.charAt(i) > '9') {
				isInputInt = false;
				break;
			}
			
			System.out.println(i + ": " + input.charAt(i));
		}
		
		return isInputInt;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a day: ");
		String input = sc.nextLine();
		
		if (checkInt(input)) {
			System.out.println(" day is  " + Integer.parseInt(input)) ;
		}
		else {
			System.out.println("Invalid input type");
		}
		
		System.out.println("bye! Have a nice day!");
	}

}

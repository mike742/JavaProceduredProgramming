import java.util.Scanner;

public class UserInputs {

	public static boolean checkInt(String input) {
		boolean isInputInt = true;
		
		for(int i = 0; i < input.length(); ++i) {
			
			if(input.charAt(i) < '0' || input.charAt(i) > '9') {
				isInputInt = false;
				break;
			}
		}
		
		return isInputInt;
	}
	
	public static int countDots(String input) {
		int count = 0;
		
		for(int i = 0; i < input.length(); ++i) {
			if(input.charAt(i) == '.') {
				count++;
			}
		}
		
		return count;
	}
	
	public static boolean checkDouble(String input) {
		
		if(countDots(input) > 1) {
			return false;
		}
		
		for(int i = 0; i < input.length(); ++i) {
			
			if(input.charAt(i) != '.' 
					&& (input.charAt(i) < '0' || input.charAt(i) > '9') ) {
				
				return false;
			}
		}
		
		return true;
	}
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		String input = sc.nextLine();
		
		//System.out.println( "dots number is = " + countDots(input) );
		
		System.out.println( "input is double looking : " + checkDouble(input) );
		
		if( checkDouble(input) ) {
			
			double d = Double.parseDouble(input);
			System.out.println( " double d  = " + d );
		}
		
		/*
		if (checkInt(input)) {
			System.out.println(" day is  " + Integer.parseInt(input)) ;
		}
		else {
			System.out.println("Invalid input type");
		}
		
		System.out.println("Math.PI " + Math.PI);
		*/		
		
		System.out.println("bye! Have a nice day!");
	}

}

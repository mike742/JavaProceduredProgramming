import java.util.Scanner;

public class StoppingDistance {

	public static void main(String[] args) {

		double speed = 0;
		double tgDistance = 0;
		double sDistance = 0;
		Scanner sc = new Scanner(System.in);
		
		speed = getInput("speed", sc);
		tgDistance = getInput("tgDistance", sc);

		sDistance = speed * (2.25 + speed / 21);
		
		prl("speed = " + speed + "  tgDistance = " + tgDistance);
		prl("Stopping Distance = " + sDistance);
		
		sc.close();
		pr("Have a nice day!");
	}

	
	public static double getInput(String title, Scanner sc) {
		double res = 0;
		String input = "";
		
		do {
			pr("Enter your " + title + ": ");
			input =  sc.nextLine();
			
			if(checkDouble(input)) {
				res = Double.parseDouble(input);
			}
			else {
				prl("Invalid input!");
			}
		}
		while(!checkDouble(input));

		return res;
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
	
	
	public static void pr(String str) {
		System.out.print(str);
	}

	public static void prl(String str) {
		System.out.print(str + "\n");
	}
	
}

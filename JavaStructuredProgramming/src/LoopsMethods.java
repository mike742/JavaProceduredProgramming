
public class LoopsMethods {
	
	public static void hello() {
		
		System.out.println("Hello Java");
	}

	public static void helloUser(String user) {
		
		System.out.println("Hello " + user);
	}	
	
	public static void add(byte a, byte b) {

		System.out.println(a + b);
	}		
	
	public static void main(String[] args) {
	
		float f = (float)3.14;
		double d = 3.14;
		
		byte n1 = 4;
		byte n2 = 5;
		System.out.println(n1 + n2);
		
		add((byte)4, (byte)5);
		
		helloUser("Mark");
		
		helloUser("John");
		
		String u = "Lucy";
		
		helloUser(u);
		
		
		/*
		for( byte i = 0; i < 10; i += 2 ) {
			
			System.out.print(i + " ");
		}
		
		System.out.print("\n");

		for( byte i = 20; i >= 0; --i ) {
			
			System.out.print(i + " ");
		}
		
		System.out.print("hello\n");
		
		byte[] numbers = {1, 2, 3};
		
		for(byte i : numbers) {
			System.out.print( i + " ");
		}
		System.out.print("\n\n");
		
		// *************
		// *************
		// *************
		// *************
		byte w = 27, h = 4;
		
		for(byte row = 0; row < h; row++) {
			for(byte col = 0; col < w; ++col) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
		
		
		System.out.print("\n");
		System.out.print("\n");
		
		// *************  row == 0
		// *           *
		// *           *
		// *************  row == (h - 1)
		
		for(byte i = 0; i < h; ++i) {
			for(byte j = 0; j < w; ++j) {
				if( i == 0 || i == (h - 1) ) {
					System.out.print("*");
				}
				else {
					
					if(j == 0 || j == (w - 1)) {
						System.out.print("*");
					}
					else {
						System.out.print(" ");
					}
				}
			}
			System.out.print("\n\n");
		}
		
		
		System.out.print("continue break \n\n");
		// continue break
		byte i = 0;
		

		while(i < 10) {
			System.out.print(i + " ");
			++i;
			
			if(i == 5) { 
				++i;  // continue;
			}
		}

		System.out.print("\n\n");
		for(i = 0; i < 10; ++i) {
			if(i % 2 != 0) {
				continue;
			}
			
			System.out.print(i + " ");
		}
		
		System.out.print("\n\n");
		
		System.out.print("break \n\n");
		i = 0;
		
		while(i < 10) {
			
			if(i == 5) {
				break;
			}
			
			System.out.print(i + " ");
			++i;
		}
		
		System.out.print("\n\n");
		*/
	}
}


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

	public static int add(int a, int b) {

		return a + b;
	}		
	
	public static void drawRectangle(byte w, byte h) {
		
		System.out.print("drawRectangle(byte, byte) \n");
		
		for(byte row = 0; row < h; row++) {
			for(byte col = 0; col < w; ++col) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}
	
	public static void drawRectangle(int w, int h) {
		
		System.out.print("drawRectangle(int, int) \n");
		
		for(byte row = 0; row < h; row++) {
			for(byte col = 0; col < w; ++col) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}	

	
	public static void drawRectangle(int w, int h, char c) {
		
		System.out.print("drawRectangle(int, int, char) \n");
		
		for(byte row = 0; row < h; row++) {
			for(byte col = 0; col < w; ++col) {
				System.out.print( c );
			}
			System.out.print("\n");
		}
	}	
	
	public static void pr(String str) {
		System.out.print(str);
	}

	public static void prl(String str) {
		System.out.println(str + "\n");
	}
	
	public static void prl(int input) {
		System.out.print(input + "\n");
	}	
	
	public static void prl(byte input) {
		System.out.print(input + "\n");
	}
	
	public static void main(String[] args) {
		
		int r = add(11, 22);
		byte b = 77;
		
		prl( b );
		prl( r );
		
		pr( add(11, 22) + "\n" );
		
		drawRectangle(20, 5);
		
		drawRectangle(22, 7, '+');
		
		
		float f = 3.14f;
		double d = 3.14d;
		
		byte n1 = 4; // 4 - int
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

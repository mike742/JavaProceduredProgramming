
public class LoopsMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
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
		
		for(byte r = 0; r < h; r++) {
			
			for(byte i = 0; i < w; ++i) {
				System.out.print("*");
			}
			
			System.out.print("\n");
			
		}
		
		
		System.out.print("\n");
		System.out.print("\n");
		
		// *************
		// *           *
		// *           *
		// *************
		
		for(byte i = 0; i < h; ++i) {
			
			for(byte j = 0; j < w; ++j) {
				if( i == 0 || i == (h - 1)) {
					System.out.print("*");
				}
				else {
					if(j == 0 || j == (w - 1)) {
						System.out.print("*");
					}
					else {
						System.out.print(".");
					}
				}
			}
			
			System.out.print("\n");
		}
		

		
	}

}

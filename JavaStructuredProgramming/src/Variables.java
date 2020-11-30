
public class Variables {
	
	public int sg = 22;

	public static void main(String[] args) {

		final byte a = 127; // Byte
		int i = 7; // Integer
		short sh = 9;
		 
		
		// 1 0 1 0  1 1 0 0 
		System.out.println( "size of byte is " + Byte.SIZE 
				+ " min = " + Byte.MIN_VALUE + " max " + Byte.MAX_VALUE);
		System.out.println( "size of short is " + Short.SIZE 
				+ " min = " + Short.MIN_VALUE + " max " + Short.MAX_VALUE);
		System.out.println( "size of int is " + Integer.SIZE  
				+ " min = " + Integer.MIN_VALUE + " max " + Integer.MAX_VALUE);
		System.out.println( "size of long is " + Long.SIZE  
				+ " min = " + Long.MIN_VALUE + " max " + Long.MAX_VALUE);
		
		
		System.out.println( "size of float is " + Float.SIZE  
				+ " min = " + Float.MIN_VALUE + " max " + Float.MAX_VALUE);
		System.out.println( "size of double is " + Double.SIZE  
				+ " min = " + Double.MIN_VALUE + " max " + Double.MAX_VALUE);		

		System.out.println( "size of char is " + Character.SIZE  
				+ " min = " + Character.MIN_VALUE + " max " + Character.MAX_VALUE);	
		
		if(a > 4) {
			
			int b = 7;

			if(0.1 + 0.2 == 0.3) {
				int c = 2;
			}
			
			int c = 3;			
		}
		
		
		
		
		// a = 7; !!!
		System.out.println("Hello Java again!" + a);
	}

}

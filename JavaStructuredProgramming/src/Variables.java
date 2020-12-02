import java.math.BigDecimal;
import java.math.BigInteger;

public class Variables {
	
	public int sg = 22;

	public static void main(String[] args) {
		/*
		float f = 3.14f;
		float f2 = (float)3.14;
		
		double d = 3.14;
		
		f = 0.1234567890123456789f;
		
		System.out.println(f);
		
		d = 0.1234567890123456789;
		System.out.println(d);
		
		double total = 0;
		byte i = 0;
		
		while(i < 100) {
			total = total + 0.2;
			i++;
		}
		// 100 * 0.2 = 20
		// 0.1 + 0.2 === 0.3
		System.out.println("total = " + total);
		System.out.println("total = " + (100 * 0.2));
		
		BigDecimal bd = new BigDecimal("0");
		System.out.println("bd = " + bd);
		
		i = 0;
		
		while(i < 100) {
			bd = bd.add( new BigDecimal("0.2") ); // bd + 0.2
			i++;
		}
		
		System.out.println("bd = " + bd);
		
		BigDecimal bd1 = new BigDecimal("123456789.123456789");
		BigDecimal bd2 = new BigDecimal("987654321.987654321");
		
		BigDecimal bdTotal = BigDecimal.ZERO;
		
		bdTotal = bd1.multiply(bd2);
		bdTotal = bd1.subtract(bd2);
		bdTotal = bd1.divide(new BigDecimal("2"));
		
		bdTotal = bd1.pow(2);
		
		System.out.println("bdTotal = " + bdTotal);
		
		double res = 1.23456;
		System.out.println( "res  = " + String.format("%.3f", res)  );
		System.out.println( "res  = " + res);
		
	
		final byte a = 127; // Byte
		
		int i = 7; // Integer
		short sh = 9;
		 */
		
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
		/*
		if(a > 4) {
			
			int b = 7;

			if(0.1 + 0.2 == 0.3) {
				int c = 2;
			}
			
			int c = 3;			
		}
		
		
		
		
		// a = 7; !!!
		System.out.println("Hello Java again!" + a);
		*/
	}

}

package section02;

/*
 * 정수형
 * byte 
 * short
 * int
 * long
 */

public class Variable03 {
	public static void main(String[] args) {
		
		byte iByte = 10;
		short iShort = 100;
		int iInt = 10000;
		long iLong = 1000000000;
		
		System.out.println(iByte);
		System.out.println(iShort);
		System.out.println(iInt);
		System.out.println(iLong);
		
		iByte += 120;
		
		System.out.println("byte overflow " + iByte);
		
	}
}

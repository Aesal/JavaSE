package section05;
/*
 * 000*000
 * 00***00
 * 0*****0
 * *******
 *  *****
 *   ***
 *    *
 * */


public class LoopHomeWork01 {

    public static void main(String[] args) {
    
		int maxcount = 7;

		Work01(maxcount);
		System.out.println("-----------------------------------------");

		Work02(maxcount);
		System.out.println("-----------------------------------------");

		Work03(maxcount);
		System.out.println("-----------------------------------------");

		Work04(maxcount);
		System.out.println("-----------------------------------------");


    }







	public static void Work01(int maxCount){
		//1번
		for (int i = 0; i <maxCount; i++) {

			for (int j=0; j<=i; j++) {
				System.out.print("*");
			}

			for (int k=maxCount; k>i; k--){
				System.out.print("0");
			}

			System.out.println("");
		} // end of for
	}

	public static void Work02(int maxCount) {
		//2번
		for (int i = 0; i < maxCount; i++) {

			for (int j = maxCount; j>i; j--) {
				System.out.print("0");
			}

			for (int k=0; k<=i; k++) {
				System.out.print("*");
			}

			System.out.println("");

		} // end of for
	}

	public static void Work03(int maxCount) {

		//3번
		for (int i = 0; i < maxCount; i++) {

			for (int j = maxCount; j>i; j--) {
				System.out.print("0");
			}

			for (int j=0; j<=i*2; j++) {
				System.out.print("*");
			}

			for (int j = maxCount; j>i; j--) {
				System.out.print("0");
			}

			System.out.println("");

		} // end of for
	}

	public static void Work04(int maxCount) {
		//같은문장 반복이라 호출.
		Work03(maxCount);

		//4번
		for (int i = 0; i <= maxCount; i++) {

			for (int j = 0; j<i; j++) {
				System.out.print("0");
			}

			for (int k = maxCount*2; k>=i*2; k--) {
				System.out.print("*");
			}

			for (int j = 0; j<i; j++) {
				System.out.print("0");
			}

			System.out.println("");

		}//end of for
	}



}

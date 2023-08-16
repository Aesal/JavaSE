import org.junit.jupiter.api.Test;

	/* ↓ →
	* 00
	* 01 10
	* 20 11 02
	* 03 12 21 30
	* 40 31 22 13 04
	* 05 14 23 32 14 50
	* 60 51 42 33 24 15 06
	* 16 25 34 43 52 61
	* 62 53 44 35 26
	* 36 45 54 63
	* 64 55 46
	* 56 65
	* 66
	*/


class BoradApplicationTests {
	public static int[][] createArr () {
	    int iCalc = 1; // ~ 49

	    int[][] iArray = new int[7][7];

		//i 변수 입력 및 확인 ez
		for (int[] arrSub : iArray){

			for (int i = 0; i <= 6; i++) {
				arrSub[i] = iCalc++;
				System.out.printf("%-3d", arrSub[i]);

			}
			System.out.println("");
		}

		System.out.println("--------------------");

		return iArray;
	}



	//완료1
	@Test
	public void testClass() {
		//배열 생성
		final int[][] arrResult = createArr();

		//정방향
		for (int i = 0; i <= 6; i++) {
			int iCount = i;

			for (int j = 0; j <= i; j++) {

				if (i % 2 == 0) {
					System.out.printf("%-3d", arrResult[iCount][j]);
				} else {
					System.out.printf("%-3d", arrResult[j][iCount]);
				}

				iCount--;
			}
			if (i != 6) System.out.println("");
		}

		//역방향
		for (int i = 0; i <= 6; i++) {
			int iCount = 6;

			for (int j = i; j <= 6; j++) {

				if (i == 0) continue;

				if (i % 2 == 0) {
					System.out.printf("%-3d", arrResult[iCount][j]);
				} else {
					System.out.printf("%-3d", arrResult[j][iCount]);
				}

				iCount--;
			}
			System.out.println("");
		}
	}



}

package section06;
/*
숙제!

 1  2  3  4  5  6  7		
 8  9  10 11 12 13 14		
 15 16 17 18 19 20 21		
 22 23 24 25 26 27 28		
 29 30 31 32 33 34 35		
 36 37 38 39 40 41 42		
 43 44 45 46 47 48 49	
 
 1. 2중배열[7][7] 선언하고 
 2. for문 1~49까지 대입하기
 3. 아래 모양으로 출력하기

1 
2 8 
15 9 3 
4 10 16 22 
29 23 17 11 5 
6 12 18 24 30 36 
43 37 31 25 19 13 7 
14 20 26 32 38 44 
45 39 33 27 21 
28 34 40 46 
47 41 35 
42 48 
49 




*/

public class ArrayHomeWork {

}

public void calcTest() {

		int[][] iArray = new int[7][7];
		int iCalc = 1; // ~ 49


		//i 변수 입력 및 확인 ez
			for (int[] arrSub : iArray){

				for (int i = 0; i <= 6; i++) {
					arrSub[i] = iCalc++;
					System.out.printf("%-3d", arrSub[i]);

				}
				System.out.println("");
			}

		System.out.println("--------------------");



	}


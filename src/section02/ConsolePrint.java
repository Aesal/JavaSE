package section02;

/*
 * 출력문
 *  데이터를 화면에 출력하는 방법
 *   %d : 정수(10)
 *   %o : 정수(8)
 *   %x : 정수(16)
 *   %f : 실수
 *   %e : 지수(e표기)
 *   %s : 문자열
 *   %c : 문자
 */
public class ConsolePrint {
	public static void main(String[] args) {
		System.out.print("welcome");
		System.out.println("java world");
		System.out.printf("오늘은 %d월 %d일 입니다.\n",8,5);
		System.out.printf("%d은 첫번째, %f은 두번째 %s은 세번째", 1, 2.0, "셋");
		
	}
	
	
}


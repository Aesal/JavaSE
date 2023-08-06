package section02;
/*
 * String 형 (문자열)
 * 참조형변수
 * 
 * 선언방법
 * String 변수명;
 * 
 */

public class Variable06 {

		public static void main(String[] args) {
			String str = "안녕하세요";
			System.out.println("str : " + str);
			
			String hello = "hello";
			System.out.println("1번 인덱스: " + hello.charAt(1));
			System.out.println("2번 인덱스부터 4번 인덱스 전까지 " + hello.substring(2,4));
			
			
			String addr = "서울 특별시 서대문구 신촌";
			boolean isContain = addr.contains("특별시");
			
			if(isContain) {
				System.out.println("특별시민입니다.");
			} else {
				System.out.println("외지사람입니다");
			}
			
			
			
		}
}

package section01;
/*
 * dobby2024
 *
 */
public class Comment {
	public static void main(String[] args) {
	//System.out.println("Hello, java");
		getArea(10);
	}
	
	/**
	 * 반지름(r)을 입력하여 원의 넓이를 출력한다.
	 * @param r - 반지름
	 */
	public static void getArea(int r) {
		double area = Math.PI * Math.pow(r, 2);
		System.out.println("원의 넓이 : " + area);
		
	}
	
	
}

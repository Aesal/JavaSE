package section02;

import java.math.BigDecimal;

/*
 * 데이터 표현방식
 * 정수표현
 * 
 */

public class Variable05 {
	public static void main(String[] args) {
		float f = 0.0f;
		double d = 0.0;
		BigDecimal bd = new BigDecimal(0.0);
		
		for(int i = 0; i < 100; i++) {
			f += 0.1f;
			d += 0.1;
			bd = bd.add(new BigDecimal(0.1));
			
		}
		
		System.out.println("f의 값:" + f);
		System.out.println("d의 값:" + d);
		System.out.println("bd의 값:" + bd);
	}
}

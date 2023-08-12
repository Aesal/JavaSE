package section03;
/*
연산자(Operator)
 프로그램에서 데이터를 처리하여 산출하는것을 연산이라 한다.
 연산에 사용되는 표시나 기호를 연산자 라고 한다.


 */

public class Operator01 {
    public static void main(String[] args) {

        int num1 = 10;
        int num2 = 5;

        int sum = num1 + num2;

        System.out.println("두수의 합 : " + sum);

        String result;

        result = num1 + "+" + num2 + "=" + sum;

        System.out.println(result);

        int multiply = num1 * num2;
        System.out.println("두수의 곱 : " + multiply);

        int divide = num1 / num2;
        System.out.println("두수의 나누기 : " + divide);

        int remain = 9 % 5;
        System.out.println("두수의 나머지 : " + remain);


    }
}

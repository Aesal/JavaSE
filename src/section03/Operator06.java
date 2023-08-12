package section03;
/*
*  6. 비트 연산자
*  2진수로 표현된 두 비트 연산자
*
*  & : and
*  | : or
*  ^ : xor
*  ~ : not
* */
public class Operator06 {

    public static void main(String[] args) {
        int num1 = 3;
        int num2 = 5;

        System.out.println("num1 & num2 : " + (num1 & num2));

        System.out.println("num1 | num2 : " + (num1 | num2));

        System.out.println("num1 ^ num2 : " + (num1 ^ num2));

        System.out.println("~num1 : " + ~num1);

    }
}

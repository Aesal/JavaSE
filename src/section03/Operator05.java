package section03;
/*
* 대입 연산자
* 변수에 값을 할당하는데 사용되는 연산자 입니다.
*
* = 등호
*
* +=, -=, *=, /=, &=
* */
public class Operator05 {

    public static void main(String[] args) {

        int num = 10;

        num += 10; // num = num + 10;
        System.out.println("num : " + num);

        num -= 5;
        System.out.println("num : "+ num);

        num /= 5;
        System.out.println("num : "+ num);

        num &= 5;
        System.out.println("num : "+ num);



    }
}

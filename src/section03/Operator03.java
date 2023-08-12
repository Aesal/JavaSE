package section03;

import java.util.Scanner;

/*
* 3.    비교 연산자
*       연산 결과를 비교하여 boolean으로 반환한다.
*
*
* */
public class Operator03 {

    public static void main(String[] args) {
        Boolean result = 10 < 20;
        System.out.println("result: " + result);

        if(result){
            System.out.println("10은 20보다 작다");
        } else
            System.out.println("10은 20보다 크다.");


        Scanner scanner = new Scanner(System.in);
        System.out.println("나이를 입력하세요 >>>");
        int age = scanner.nextInt();
        if(age >= 19) {
            System.out.println("만 19세 이상입니다.");
        } else {
            System.out.println("미성년자 입니다");
        }
    }

}

package section03;
/*
*  8. 삼항 연산자
*
* */
public class Operator08 {

    public static void main(String[] args) {

        int num = 10;
        String result = num > 0 ? "Num은 양수" : "num은 음수";

        System.out.println(result);

        String result2 = "";
        if (num > 0) {
            result2 = "num은 양수";
        } else {
            result2 = "num은 음수";
        }

        System.out.println(result2);

        int x = 8;
        int y = 12;

        int max = (x > y) ? x : y; // x와 y중 큰 값을 선택
        System.out.println("두 수 중 큰값은 : " + max);

        int a = 5;
        int b = 3;
        int c = 7;

        int largest = (a > b) ? ((a>c)? a:c) : ((b>c)? b:c);
        System.out.println("세 수중 가장 큰값은 : "+ largest);










    }
}

package section04;
/*
* if ~ else if ~ else
*
* */
public class Conditional03 {

    public static void main(String[] args) {
        double num = 13.8;

        if (num % 3 == 0) {
            System.out.println("num % 3 == 0");
        } else if (num % 3 == 1) {
            System.out.println("num % 3 == 1");
        } else if (num % 3 == 2) {
            System.out.println("num % 3 == 2");
        } else {
            System.out.println("num은 정수가 아닙니다");
        }

        String id = "ABD";
        String pwd = "1234";

        if (id != "ABC") {
            System.out.println("id fail");
            return;
        } else if (pwd != "1234") {
            System.out.println("pwd fail");
            return;
        }

        System.out.println("login");


    }


}

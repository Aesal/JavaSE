package section04;
/*
*
* 제어문
* 프로그램 실행 흐름을 제어하기 위해 사용되는 구문
*
* 조건문
* 주어진 조건식의 결과에 따라 별도의 명령을 수행하도록 제어하는 명령문
*
* 1. if 문
*  if(조건) {
*   조건식이 true 일 때 실행되는 코드 영역.
* }
*
*  if(조건식)
*   조건식이 true 일 때 실행 명령문 (명령문이 한줄(;)일때 중괄호 생략 가능)
*
* */
public class Conditional01 {

    public static void main(String[] args) {

        int num = 11;

        if ((num & 2) == 0) {
            System.out.println("짝수");
        } else {
            System.out.println("홀수");
        }

        if ((num & 2) != 0) {
            System.out.println("홀수");
        } else {
            System.out.println("짝수");
        }

    }

}

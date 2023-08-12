package section03;
/*
*  4. 논리 연산자
*  && : and
*  || : OR
*  !  : NOT
*
* */
public class Operator04 {

    public static void main(String[] args) {

        boolean result = true && true;
        System.out.println("result : " + result);

        boolean result2 = true || true;
        System.out.println("result2 : " + result2);

        boolean result3 = true;
        System.out.println("result3 : " + !result3);

        String order = "의류";

        if (order == "식품" || order =="전기전자" || order =="의류"){
            System.out.println("20% 할인 행사 중입니다.");
        } else {
            System.out.println("할인 미적용 상품입니다.");
        }

    }
}

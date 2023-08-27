package section12;


import section12.access02.HouseCat;
import section12.access02.PersianCat;

/*

인터페이스
추상화된 타입을 정의하는데 사용되는 개념
추상메서드와 static 상수로만 이루어져 있다.
다중 상속이 가능하다.
implements 키워드로 상속한다.
 */
public class Interface01 {

    public static void main(String[] args) {
        PersianCat persianCat = new PersianCat();

        persianCat.eat();
        persianCat.hunt();
        persianCat.sleep();




    }

}

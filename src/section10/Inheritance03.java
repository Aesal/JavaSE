package section10;


import section10.access02.Car;
import section10.access04.Jindo;
import section10.access04.PersianCat;

/*
final 클래스
클래스 키워드 앞에 final 키워드를 추가할경우
클래스 상속의 마지막임을 뜻한다. 상속 불가 클래스

final 메서드
메서드에서 final 선언하면 해당 메서드는 하위클래스에서 오버라이딩할 수 없다.

 */
public class Inheritance03 {

    public static void main(String[] args) {

        PersianCat persianCat = new PersianCat();

        persianCat.meow();
        persianCat.walk();
        persianCat.eat();


        Jindo jindo = new Jindo();

        jindo.bark();

    }


}

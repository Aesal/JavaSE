package section12;

/*
추상 클래스
미완성 클래스, 구현되지 않은 추상메서드가 존재하는 클래스.
abstract 키워드를 사용하여 선언한다.

 */

import section12.access01.Animal;
import section12.access01.Dog;
import section12.access01.Pig;

public class AbstractClass01 {
    //추상클래스 객체 생성 불가.
//    Animal animal = new Animal();

    public static void main(String[] args) {
        Pig pig = new Pig();
        pig.cry();

        Animal animal1 = new Dog();
        animal1.cry();

    }



}

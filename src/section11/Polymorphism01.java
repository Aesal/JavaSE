package section11;

import section11.access01.Bus;
import section11.access01.Car;

/*
다형성(Polymorphism)
같은 인터페이스 또는 부모 클래스를 공유하는 객체가
여러 유형의 타입을 가질 수 있는 기능을 말한다.

 */
public class Polymorphism01 {

    public static void main(String[] args) {
        Bus bus1 = new Bus();

        bus1.drive();
        bus1.clickBell();

        Car car = new Bus();

        car.drive();

        Bus bus2 = (Bus) car;

        bus2.drive();
        bus2.clickBell();
    }
}

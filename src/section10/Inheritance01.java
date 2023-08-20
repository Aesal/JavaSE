package section10;


import section09.Book;
import section10.access01.Bicycle;
import section10.access01.MountBike;

/*
상속
부모 클래스(상위, 슈퍼)와 자식클래스(하위)가 있으며
자식 클래스는 부모 클래스를 상속받아 그 부모의 멤버(변수, 메서드) 사용 가능하다.

상속 방법
 class 자식클래스 명 extends 부모 클래스명

 이름충돌 방지 : 같은 이름 클래스, 인터페이스 패키지를 달리하여 충돌방지
 코드 구조화 : 관련된 클래스를 패키지 단위로 그룹화
 접근제어 클래스나 멤버에 접근제한자를 적용하여 해당 패키지 외부에서 접근 제한 가능.

 super 키워드
 부모객체를 참조하는 키워드

 오버라이딩
 상속받은 메서드를 하위클래스에서 재정의하는 것을 말한다.
 */
public class Inheritance01  {

    public static void main(String[] args) {

        Bicycle bicycle = new Bicycle();

        bicycle.gear = 7;
        bicycle.handleType = "라이저바";
        bicycle.wheel = 22;

        System.out.println(bicycle.toString());

        MountBike mountBike = new MountBike();

        mountBike.handleType = "BMX 핸들바";
        mountBike.gear = 30;
        mountBike.wheel = 2;
        mountBike.isSuspenstion = true;

        System.out.println(mountBike.toString());



    }


}

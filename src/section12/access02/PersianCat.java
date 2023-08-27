package section12.access02;

public class PersianCat implements Cat{

    @Override
    public void eat() {
        System.out.println("yami");
    }

    @Override
    public void sleep() {
        System.out.println("Persian sleep");
    }

    @Override
    public void hunt() {
        System.out.println("hunt is mouse");
    }

}

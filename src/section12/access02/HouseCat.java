package section12.access02;

public class HouseCat implements Cat, Playable{

    @Override
    public void eat() {
        System.out.println("no eat");
    }

    @Override
    public void sleep() {
        System.out.println("sleeping");
    }

    @Override
    public void hunt() {
        System.out.println("no hunt");
    }

    @Override
    public void play() {
        System.out.println("쥐를 가지고 놀아요");
    }
}

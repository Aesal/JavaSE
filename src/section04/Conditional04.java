package section04;
/*
* switch case 문
* */
public class Conditional04 {

    public static void main(String[] args) {

        char key = 's';

        switch (key) {
            case 'w' :
                System.out.println("앞으로 이동");
            case 'a' :
                System.out.println("좌측으로 이동");
            case 's' :
                System.out.println("뒤로 이동");
            case 'd' :
                System.out.println("우측으로 이동");
            default:
                System.out.println("Hold!!!");
                break;

        }


    }

}

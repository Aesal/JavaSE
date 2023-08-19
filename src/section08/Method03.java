package section08;

public class Method03 {

    public static void main(String[] args) {

        printMember("TESTID", "피카츄", 28);

    }

    public static void printMember(String id, String name, int age) {
        System.out.println("ID : " + id);
        System.out.println("이름 : " + name);
        System.out.println("나이 : " + age);
    }

}

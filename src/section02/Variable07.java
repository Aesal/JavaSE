package section02;

public class Variable07 {

    public static void main(String[] args) {
        byte iByte = 10;
        int iInt = iByte;
        System.out.println("iInt: " + iInt);

        float iFloat = 10.1f;
        double idouble = iFloat;

        int iInt2 = 130;
        byte iByte2 = (byte) iInt2;
        System.out.println("ibyte2 " + iByte2);

        float iFloat2 = 3.14f;
        int Iint3 = (int) iFloat2;
        System.out.println(Iint3);
    }
}

package section10.access01;

public class Bicycle {


    public String handleType;
    public int wheel;
    public int gear;


    @Override
    public String toString() {
        return "Bicycle{" +
                "handleType='" + handleType + '\'' +
                ", wheel=" + wheel +
                ", gear=" + gear +
                '}';
    }
}

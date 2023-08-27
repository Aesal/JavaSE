package section10.access02;

public class Car {
    // Car 객체 속성
    public String model;
    protected String color;
    int year;
    private String brand;


    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", brand='" + brand + '\'' +
                '}';
    }
}

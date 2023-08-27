package section10.access03;

import section10.access02.Car;

public class SportsCar extends Car {
    public boolean isOpen;

    @Override
    public String toString() {
        return "SportsCar{" +
                "isOpen=" + isOpen +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}

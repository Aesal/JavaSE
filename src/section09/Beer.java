package section09;

public class Beer {

    int volume;
    String brand;
    String type;
    int price;

    public Beer(int volume, String brand, String type, int price) {
        this.volume = volume;
        this.brand = brand;
        this.type = type;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Beer{" +
                "volume=" + volume +
                ", brand='" + brand + '\'' +
                ", type='" + type + '\'' +
                ", price=" + price +
                '}';
    }
}

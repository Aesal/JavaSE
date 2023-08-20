package section10.access01;

public class MountBike extends Bicycle{

    public boolean isSuspenstion;

    @Override
    public String toString() {
        return "MountBike{" +
                "isSuspenstion=" + isSuspenstion +
                ", handleType='" + handleType + '\'' +
                ", wheel=" + wheel +
                ", Gear=" + gear +
                '}';
    }
}

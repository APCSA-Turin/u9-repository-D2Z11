package old;
public class Bicycle extends Vehicle {
    private int gearCount;

    Bicycle(String name, int wheels) {
        super(name, wheels);
    }

    public int getGearCount() {
        return gearCount;
    }

    public void setGearCount(int nGC) {
        gearCount = nGC;
    }

    public void ringBell() {
        System.out.println("Ding ding");
    }
}
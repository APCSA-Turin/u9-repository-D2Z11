package old;
public class Desktop extends Computer {
    private int screenSize;
    private int memory;
    private boolean monitorIncluded;

    public Desktop(int screenSize, int memory, boolean monitorIncluded) {
        super(screenSize, memory);
        this.screenSize = screenSize;
        this.memory = memory;
        this.monitorIncluded = monitorIncluded;
    }

    public boolean isMonitorIncluded() {
        return monitorIncluded;
    }

    public void replaceTowerCasing() {
        System.out.println("Replaced tower case!");
    }
}
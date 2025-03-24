package old;
public class Tablet extends Computer {
    private int screenSize;
    private int memory;
    private boolean stylusIncluded;

    public Tablet(int screenSize, int memory, boolean stylusIncluded) {
        super(screenSize, memory);
        this.screenSize = screenSize;
        this.memory = memory;
        this.stylusIncluded = stylusIncluded;
    }

    public boolean isStylusIncluded() {
        return stylusIncluded;
    }
}
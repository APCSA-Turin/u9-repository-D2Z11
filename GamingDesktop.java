public class GamingDesktop extends Desktop {
    private String graphicsCard;

    GamingDesktop(int screenSize, int memory) {
        super(screenSize, memory, true);
    }

    public String getGraphicsCard() {
        return graphicsCard;
    }

    public void updateGraphicsCardDrivers(String n) {
        System.out.println("updated graphics card drivers");
    }
}
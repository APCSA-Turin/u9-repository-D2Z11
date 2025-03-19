import java.lang.reflect.Method;

public class ComputerRunner {
    public static void main(String[] args) {
        System.out.println("---- TESTING COMPUTER OBJECT ----");
        Computer computer1 = new Computer(12, 256);
        System.out.println(computer1.getScreenSize());
        System.out.println(computer1.getMemory());
        computer1.installOperatingSystem();
        System.out.println(computer1 instanceof Computer);
        System.out.println("---- TESTING DESKTOP OBJECT ----");
        Desktop desktop1 = new Desktop(18, 512, true);
        System.out.println(desktop1.getScreenSize());
        System.out.println(desktop1.getMemory());
        System.out.println(desktop1.isMonitorIncluded());
        desktop1.installOperatingSystem();
        desktop1.replaceTowerCasing();
        System.out.println(desktop1 instanceof Desktop);
        System.out.println(desktop1 instanceof Computer);
        System.out.println("---- TESTING LAPTOP OBJECT ----");
        Laptop laptop1 = new Laptop(14, 128);
        System.out.println(laptop1.getScreenSize());
        System.out.println(laptop1.getMemory());
        System.out.println(laptop1.isTrackPadCalibrated());
        laptop1.installOperatingSystem();
        laptop1.calibrateTrackpad();
        System.out.println(laptop1 instanceof Laptop);
        System.out.println(laptop1 instanceof Computer);
        System.out.println("---- TESTING TABLET OBJECT ----");
        Tablet tablet1 = new Tablet(9, 64, false);
        System.out.println(tablet1.getScreenSize());
        System.out.println(tablet1.getMemory());
        System.out.println(tablet1.isStylusIncluded());
        tablet1.installOperatingSystem();
        System.out.println(tablet1 instanceof Tablet);
        System.out.println(tablet1 instanceof Computer);
        System.out.println("---- ADDITIONAL TESTS ----");
        Method[] methods = Desktop.class.getMethods();
        for (Method m : methods) {
            Class declaringClass = m.getDeclaringClass();
            if (m.getName().equals("installOperatingSystem")) {
                if (declaringClass.getName().equals("Computer")) {
                    System.out.println("PASS");
                } else {
                    System.out.println("FAIL! the installOperatingSystem method should be removed from the Desktop subclass and inherited from Computer");
                }
            }
            if (m.getName().equals("getScreenSize")) {
                if (declaringClass.getName().equals("Computer")) {
                    System.out.println("PASS");
                } else {
                    System.out.println("FAIL! the getScreenSize method should be removed from the Desktop subclass and inherited from Computer");
                }
            }
            if (m.getName().equals("getMemory")) {
                if (declaringClass.getName().equals("Computer")) {
                    System.out.println("PASS");
                } else {
                    System.out.println("FAIL! the getMemory method should be removed from the Desktop subclass and inherited from Computer");
                }
            }
        }
        Method[] methods2 = Laptop.class.getMethods();
        for (Method m : methods2) {
            Class declaringClass = m.getDeclaringClass();
            if (m.getName().equals("installOperatingSystem")) {
                if (declaringClass.getName().equals("Computer")) {
                    System.out.println("PASS");
                } else {
                    System.out.println("FAIL! the installOperatingSystem method should be removed from the Laptop subclass and inherited from Computer");
                }
            }
            if (m.getName().equals("getScreenSize")) {
                if (declaringClass.getName().equals("Computer")) {
                    System.out.println("PASS");
                } else {
                    System.out.println("FAIL! the getScreenSize method should be removed from the Laptop subclass and inherited from Computer");
                }
            }
            if (m.getName().equals("getMemory")) {
                if (declaringClass.getName().equals("Computer")) {
                    System.out.println("PASS");
                } else {
                    System.out.println("FAIL! the getMemory method should be removed from the Laptop subclass and inherited from Computer");
                }
            }
        }
        Method[] methods3 = Tablet.class.getMethods();
        for (Method m : methods3) {
            Class declaringClass = m.getDeclaringClass();
            if (m.getName().equals("installOperatingSystem")) {
                if (declaringClass.getName().equals("Computer")) {
                    System.out.println("PASS");
                } else {
                    System.out.println("FAIL! the installOperatingSystem method should be removed from the Tablet subclass and inherited from Computer");
                }
            }
            if (m.getName().equals("getScreenSize")) {
                if (declaringClass.getName().equals("Computer")) {
                    System.out.println("PASS");
                } else {
                    System.out.println("FAIL! the getScreenSize method should be removed from the Tablet subclass and inherited from Computer");
                }
            }
            if (m.getName().equals("getMemory")) {
                if (declaringClass.getName().equals("Computer")) {
                    System.out.println("PASS");
                } else {
                    System.out.println("FAIL! the getMemory method should be removed from the Tablet subclass and inherited from Computer");
                }
            }
        }
    }
}
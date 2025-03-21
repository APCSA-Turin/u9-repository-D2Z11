public class Run {
    public static void main(String[] args) {
        Vehicle v = new Vehicle("WAFJ23", 10, 1);
        v.ask();
        Car car = new Car("EWTTWE1", 13, 2, true);
        car.ask();
        Truck t = new Truck("WRY127", 12.75, 1, 2, false);
        t.ask();
        Taxi myTaxi4 = new Taxi("TX1412", 13.75, 4, true, 2.0);
        myTaxi4.ask();
    }
}

public class Taxi extends Car {
    double fareCollected;
    // boolean hasDiscount;

    public Taxi(String licensePlate, double tollFee, int passengers, boolean electric, double fareCollected) {
        super(licensePlate, tollFee, passengers, electric);
        // hasDiscount = discount;
        this.fareCollected = fareCollected;
    }

    public double getFareCollected() {
        return fareCollected;
    }

    public void printTaxi() {
        System.out.println("License: " + getLicensePlate());
        System.out.println("Toll: " + getTollFee());
        System.out.println("Passengers: " + getPassengers());
        System.out.println("Electric? " + isElectric());
        System.out.println("Fare collected: " + getFareCollected());
        System.out.println("Has discount? " + isDiscountApplied());
    }

    public void pickupRiders(int numRiders, double farePerRider) {
        setPassengers(getPassengers() + numRiders);
        fareCollected += farePerRider * numRiders;
        if (getPassengers() >= 4 && !isDiscountApplied()) {
            setTollFee(getTollFee() - (getTollFee() * 0.5));
            setDiscountApplied(true);
        }
    }
}

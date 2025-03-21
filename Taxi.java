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

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Fare collected: " + fareCollected);
    }

    public void pickupRiders(int numRiders, double farePerRider) {
        setPassengers(getPassengers() + numRiders);
        fareCollected += farePerRider * numRiders;
        if (getPassengers() >= 4 && !isDiscountApplied()) {
            setTollFee(getTollFee() - (getTollFee() * 0.5));
            setDiscountApplied(true);
        }
    }

    public boolean chargeAndDropOffRiders(double farePerRider) {
        fareCollected += farePerRider * (getPassengers() - 1);
        return super.dropOffPassengers((getPassengers() - 1));
    }

    @Override
    public void ask() {
        System.out.println("Pay on the screen in front of you.");
    }
}

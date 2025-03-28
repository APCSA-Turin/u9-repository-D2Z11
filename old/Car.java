package old;
public class Car extends Vehicle {
  private boolean electric;
  private boolean discountApplied;

  public Car(String licensePlate, double tollFee, int passengers, boolean electric) {
    super(licensePlate, tollFee, passengers);
    this.electric = electric;
    discountApplied = false; // default value
  }

  @Override
  public double calculateTollPrice() {
    if (getPassengers() > 4) {
      return getTollFee() * 4;
    }
    return getTollFee() * getPassengers();
  }

  public boolean isElectric() {
    return electric;
  }

  public boolean isDiscountApplied() {
    return discountApplied;
  }

  public void setDiscountApplied(boolean n) {
    discountApplied = n;
  }

  @Override
  public void printInfo() {
    System.out.println("License: " + getLicensePlate());
    System.out.println("Toll: " + getTollFee());
    System.out.println("Passengers: " + getPassengers());
    System.out.println("Discount? " + isDiscountApplied());
    System.out.println("Electric? " + electric);
  }

  public boolean dropOffPassengers(int numOut) {
    if (numOut >= getPassengers()) {
      return false;
    }
    setPassengers(getPassengers() - numOut);
    return true;
  }

  public void applyDiscount() {
    if (!discountApplied && electric) {
      setTollFee(getTollFee() - (getTollFee() * 0.5));
      discountApplied = true;
    }
  }

}
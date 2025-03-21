public class Vehicle {
  private String licensePlate;
  private double tollFee;
  private int passengers;

  public Vehicle(String licensePlate, double tollFee, int passengers) {
    this.licensePlate = licensePlate;
    this.tollFee = tollFee;
    this.passengers = passengers;
  }

  public String getLicensePlate() {
    return licensePlate;
  }

  public double getTollFee() {
    return tollFee;
  }

  public int getPassengers() {
    return passengers;
  }

  public void setPassengers(int n) {
    passengers = n;
  }

  public void setTollFee(double n) {
    tollFee = n;
  }

  public double calculateTollPrice() {
    return tollFee * passengers;
  }

  public void printInfo() {
    System.out.println("License: " + getLicensePlate());
    System.out.println("Toll: " + getTollFee());
    System.out.println("Passengers: " + getPassengers());
  }

  public void ask() {
    System.out.println("Are you doing well in the backseat?");
  }
}
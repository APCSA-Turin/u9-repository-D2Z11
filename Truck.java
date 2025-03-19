public class Truck extends Vehicle {
    private int axles;
    private boolean hasTrailer;
    
    public Truck(String licensePlate, double tollFee, int passengers, int axles, boolean hasTrailer) {
      super(licensePlate, tollFee, passengers);
      this.axles = axles;
      this.hasTrailer = hasTrailer;
    }
  
    public int getAxles() {
      return axles;
    }
  
    public boolean hasTrailer() {
      return hasTrailer;
    }

    public void printTruck() {
        System.out.println("License: " + getLicensePlate());
        System.out.println("Toll: " + getTollFee());
        System.out.println("Passengers: " + getPassengers());
        System.out.println("Axles: " + getAxles());
        System.out.println("Trailer? " + hasTrailer);
    }

    public boolean endsIn(String str, String end) {
      if (str.substring(str.length() - 2).equals(end)) {
        return true;
      }
      return false;
    }

    public boolean validateLicensePlate() {
      if (hasTrailer && axles > 4) {
        if (!endsIn(getLicensePlate(), "MX")) {
          return false;
        }
      }
      if (hasTrailer && axles <= 4) {
        if (!endsIn(getLicensePlate(), "LX")) {
          return false;
        }
      }
      return true;
    }
  }
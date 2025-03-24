package old;
public class Train extends Vehicle {
    int passengers = 0;

    Train(String name, int wheels) {
        super(name, wheels);
    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int p) {
        passengers = p;
    }

    @Override
    public void brake() {
        System.err.println("Stoping vehicle!");
    }
}

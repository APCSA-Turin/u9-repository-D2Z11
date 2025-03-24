package U9T5;

import java.util.ArrayList;

public class Vet {
    private ArrayList<Animal> clients;
    private String vetName;

    public Vet(String vetName) {
        clients = new ArrayList<Animal>();
        this.vetName = vetName;
    }

    public boolean addClient(Animal animal) {
        if (clients.indexOf(animal) == -1) {
            System.out.println("Welcome to " + vetName + "'s office, " + animal.getName());
            clients.add(animal);
            return true;
        } else {
            System.out.println(animal.getName() + " is already a client of " + vetName);
            return false;
        }
    }

    public void printClientList() {
        for (Animal a : clients) {
            System.out.println(a.getName() + ": " + a.getClass());
        }
    }

}
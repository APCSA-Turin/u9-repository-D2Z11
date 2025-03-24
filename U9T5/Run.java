package U9T5;

import java.util.ArrayList;

public class Run {
    public static void main(String[] args) {
        Animal animal = new Animal("Thing");
        Puppy puppy = new Puppy("Spot");
        Cow cow = new Cow("Marge");
        Dog dog = new Dog("Penny");

        ArrayList<Animal> animals = new ArrayList<>();

        animals.add(animal);
        animals.add(puppy);
        animals.add(cow);
        animals.add(dog);

        for (Animal a : animals) {
            System.out.println(a.getName());
        }

        Animal[] animals2 = new Animal[4];

        animals2[0] = animal;
        animals2[1] = puppy;
        animals2[2] = cow;
        animals2[3] = dog;

        for (Animal a : animals2) {
            if (a instanceof Cow) {
                Cow casted = (Cow) a;
                casted.milk();
            }
        }

        Vet vet = new Vet("cool vet");

        System.out.println(vet.addClient(animal));
        System.out.println(vet.addClient(puppy));
        System.out.println(vet.addClient(cow));
        System.out.println(vet.addClient(dog));

        System.out.println(vet.addClient(animal));
        System.out.println(vet.addClient(puppy));
        System.out.println(vet.addClient(cow));
        System.out.println(vet.addClient(dog));
    }
}

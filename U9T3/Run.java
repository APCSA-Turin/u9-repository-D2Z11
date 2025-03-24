package U9T3;

public class Run {
    public static void main(String[] args) {
        Agent amy = new Agent("Amy Higgins", "646-555-5555");
Comedian morgan = new Comedian("Morgan Smith", 31, amy);
morgan.callAgent("Knock knock? Who's there? Boo? Boo who? Now don't start crying, it was only a joke!");
    }
}

package U9T3;


public class Performer {
    private String name;
    private int age;
    private int performances;
    private Agent agent;

    public Performer(String name, int age, Agent agent) {
        this.name = name;
        this.age = age;
        this.agent = agent;
        performances = 0;
    }

    public String getName() {
        return name;
    }

    public Agent getAgent() {
        return agent;
    }

    public void perform() {
        performances++;
        System.out.println("Performing for an audience! Performance #" + performances);
    }

    public void rehearse() {
        System.out.println("Rehearsing for the big show!");
    }

    public void callAgent() {
        System.out.println("Calling my agent, " + agent.getName());
    }
}
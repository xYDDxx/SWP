package at.ydd.learning.basics.objectOrientation.lamp;

public class LampElement {
    private String name;
    private String color;
    private int consumption;

    public enum State {On, Off}

    public State state;

    public LampElement(String name, String color, int consumption, State state) {
        this.name = name;
        this.color = color;
        this.consumption = consumption;
        this.state = state;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getConsumption() {
        return consumption;
    }

    public void setConsumption(int consumption) {
        this.consumption = consumption;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void turnOn() {
        if (this.state == State.On) {
            System.out.println("Mein Name ist " + name + ". Ich bin bereits eingeschaltet");
        } else {
            this.state = State.On;
            System.out.println("Mein Name ist " + name + ". Ich bin jetzt eingeschalten");
        }
    }

}

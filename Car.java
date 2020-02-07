package Task6;

public class Car {
    private String model;
    private String speed;

    Car(String model, String speed) {
        this.model = model;
        this.speed = speed;
    }

    public String getModel() {
        return this.model;
    }

    public String getSpeed() {
        return this.speed;
    }

    public String toString() {
        return String.format("%n%s %s", this.getModel(), this.getSpeed());
    }
}


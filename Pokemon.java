package Task6;

public class Pokemon {
    private String name;
    private String type;

    Pokemon(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return this.name;
    }

    public String getType() {
        return this.type;
    }

    public String toString() {
        return String.format("%s %s", this.getName(), this.getType());
    }
}

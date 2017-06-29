package boxes;

public class Thing {

    private String name;
    private int weight;

    public Thing(String name, int weight) {
        if (weight < 0) {
            throw new IllegalArgumentException("weight cannot be negative");
        }

        this.name = name;
        this.weight = weight;
    }

    public Thing(String name) {
        this(name, 0);
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Thing)) {
            return false;
        }

        Thing comparison = (Thing) o;
        if (name.equals(comparison.getName())) {
            return true;
        }

        return false;
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }

}

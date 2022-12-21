public class Pet implements Nameable {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public Pet(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public String toString() {
        return "Pet{name='" + this.getName() + "'}";
    }
}
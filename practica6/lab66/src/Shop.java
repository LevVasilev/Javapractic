public class Shop implements Printable {
    private String name;

    public Shop(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void print() {
        System.out.println("Printing Shop: " + this.getName());
    }

    public String toString() {
        return "Shop{name='" + this.name + "'}";
    }
}

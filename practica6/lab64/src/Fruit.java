public class Fruit implements Priceable {
    private String name;
    private double price;

    public Fruit(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return this.price;
    }

    public String toString() {
        String var10000 = this.name;
        return "Fruit{name='" + var10000 + "', price=" + this.getPrice() + "$}";
    }
}

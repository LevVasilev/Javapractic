public class Ball implements Priceable {
    private double price;
    private String type;

    public Ball(double price, String type) {
        this.price = price;
        this.type = type;
    }

    public double getPrice() {
        return this.price;
    }

    public String toString() {
        double var10000 = this.getPrice();
        return "Ball{price=" + var10000 + "$, type='" + this.type + "}";
    }
}

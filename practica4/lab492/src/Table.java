public class Table extends Furniture {
    private int size;

    public Table(String material, int price, int size) {
        super(material, price);
        this.size = size;
    }

    int getPrice() {
        return this.price * this.size;
    }

    public String toString() {
        return "Table: made of " + this.material + " for " + this.price + " with size " + this.size + "; full price is " + this.price * this.size;
    }
}
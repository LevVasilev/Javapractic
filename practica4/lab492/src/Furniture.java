public abstract class Furniture {
    protected String material;
    protected int price;

    public Furniture(String material, int price) {
        this.material = material;
        this.price = price;
    }

    abstract int getPrice();

    public String toString() {
        return "Furniture{material='" + this.material + "', price=" + this.price + "}";
    }
}

public class Test {
    public Test() {
    }

    public static void main(String[] args) {
        Ball b1 = new Ball(56.78, "football");
        Ball b2 = new Ball(99.11, "basketball");
        Ball b3 = new Ball(110.0, "volleyball");
        Fruit f1 = new Fruit("apple", 56.12);
        Fruit f2 = new Fruit("orange", 35.0);
        Priceable[] prices = new Priceable[]{b1, b2, b3, f1, f2};
        Priceable[] var7 = prices;
        int var8 = prices.length;

        for(int var9 = 0; var9 < var8; ++var9) {
            Priceable price = var7[var9];
            System.out.println(price);
        }

    }
}

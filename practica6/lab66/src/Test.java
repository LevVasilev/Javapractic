public class Test {
    public Test() {
    }

    public static void main(String[] args) {
        Book b1 = new Book("name1");
        Book b2 = new Book("name2");
        Shop sh1 = new Shop("shop1");
        Shop sh2 = new Shop("shop2");
        Printable[] printables = new Printable[]{b1, b2, sh1, sh2};
        Printable[] var6 = printables;
        int var7 = printables.length;

        for(int var8 = 0; var8 < var7; ++var8) {
            Printable printable = var6[var8];
            printable.print();
        }

    }
}
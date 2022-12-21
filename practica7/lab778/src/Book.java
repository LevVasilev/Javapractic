
public class Book implements Printable {
    String name;

    public Book(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public Printable print() {
        System.out.println(this.name);
        return null;
    }

    public static void printBooks(Printable[] printables) {
        Printable[] var1 = printables;
        int var2 = printables.length;

        for(int var3 = 0; var3 < var2; ++var3) {
            Printable p = var1[var3];
            if (p instanceof Book) {
                p.print();
            }
        }

    }
}

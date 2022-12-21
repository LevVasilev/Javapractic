
public class Magazine implements Printable {
    String name;

    public Magazine(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public static void printMagazines(Printable[] printables) {
        Printable[] var1 = printables;
        int var2 = printables.length;

        for(int var3 = 0; var3 < var2; ++var3) {
            Printable p = var1[var3];
            if (p instanceof Magazine) {
                p.print();
            }
        }

    }

    public Printable print() {
        System.out.println(this.name);
        return null;
    }
}

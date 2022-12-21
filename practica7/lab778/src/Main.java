
public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Printable[] printables = new Printable[]{new Magazine("magazine1"), new Book("book1"), new Magazine("magazine2")};
        int k = 0;
        Printable[] var3 = printables;
        int var4 = printables.length;

        Printable var10000;
        int var5;
        for(var5 = 0; var5 < var4; ++var5) {
            var10000 = var3[var5];
            if (printables[k] instanceof Magazine) {
                System.out.println("[+] method is used printMagazines:");
                Magazine.printMagazines(printables);
                ++k;
            }
        }

        var3 = printables;
        var4 = printables.length;

        for(var5 = 0; var5 < var4; ++var5) {
            var10000 = var3[var5];
            if (printables[k] instanceof Book) {
                System.out.println("[+] method is used printBooks:");
                Book.printBooks(printables);
                ++k;
            }
        }

    }
}

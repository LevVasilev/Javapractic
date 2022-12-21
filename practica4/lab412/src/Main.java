import java.io.PrintStream;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Phone phone1 = new Phone("89250925060", "Apple", 7.9);
        Phone phone2 = new Phone("89250874598", "Samsung");
        Phone phone3 = new Phone();
        PrintStream var10000 = System.out;
        String var10001 = phone1.getNumber();
        var10000.println(var10001 + "\t" + phone1.getModel() + "\t" + phone1.getWeight() + "\n");
        var10000 = System.out;
        var10001 = phone2.getNumber();
        var10000.println(var10001 + "\t" + phone2.getModel() + "\t" + phone2.getWeight() + "\n");
        var10000 = System.out;
        var10001 = phone3.getNumber();
        var10000.println(var10001 + "\t" + phone3.getModel() + "\t" + phone3.getWeight() + "\n");
        phone1.receiveCall("Mother");
        phone2.receiveCall("Father");
        phone2.receiveCall("Sister", "89254356523");
        phone1.sendMessage(new String[]{"423984723947", "385739857435", "34753475375"});
    }
}

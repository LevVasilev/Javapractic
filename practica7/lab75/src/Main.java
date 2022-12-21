
import java.io.PrintStream;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        StringWork s1 = new ProcessStrings();
        String s = "dkjhfskjfsdhfksdjkfh";
        System.out.print("[+] Count symbols in string:  ");
        s1.CountSumbols(s);
        System.out.print("[+] Reverse string:  ");
        s1.ReverseString(s);
        PrintStream var10000 = System.out;
        String var10001 = s1.NewString(s);
        var10000.println("[+] String with odd symbols:  " + var10001);
    }
}
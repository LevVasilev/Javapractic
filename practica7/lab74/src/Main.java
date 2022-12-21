import java.io.PrintStream;
import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        MathCalculable mc1 = new MathFunc(4.0, 5.0);
        int radius = 3;
        double area = mc1.PI() * (double)(radius * radius);
        System.out.println("[+] The area of the circle is: " + area);
        Scanner sc = new Scanner(System.in);
        System.out.println("[+] Enter the edge of the cube:");
        double a = sc.nextDouble();
        PrintStream var10000 = System.out;
        double var10001 = mc1.Degree(a, 3);
        var10000.println("[+] Cube Formula V = a^3, V = " + var10001);
        System.out.println("[+] Modulus of a complex number " + mc1.ComNum());
    }
}
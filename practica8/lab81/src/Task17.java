
import java.util.Scanner;

public class Task17 {
    public Task17() {
    }

    public static int recursion() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        return n == 0 ? 0 : Math.max(n, recursion());
    }

    public static void main(String[] args) {
        System.out.println(recursion());
    }
}
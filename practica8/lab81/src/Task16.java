import java.util.Scanner;

public class Task16 {
    public Task16() {
    }

    public static void recursion(int max, int count) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n > 0) {
            if (n > max) {
                recursion(n, 1);
            } else if (n == max) {
                ++count;
                recursion(max, count);
            } else {
                recursion(n, max);
            }
        } else {
            System.out.println(count);
        }

    }

    public static void main(String[] args) {
        recursion(0, 0);
    }
}

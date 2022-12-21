import java.util.Scanner;

public class MainMatrix {
    public MainMatrix() {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of columns and rows of the first matrix: ");
        int row = sc.nextInt();
        int col = sc.nextInt();
        Matrix m1 = new Matrix(col, row);
        System.out.println("Enter the number of columns and rows of the second matrix: ");
        row = sc.nextInt();
        col = sc.nextInt();
        Matrix m2 = new Matrix(col, row);
        System.out.println("Сумма матриц");
        m1.matrixSum(m2);
        m1.outMatrix();
    }
}

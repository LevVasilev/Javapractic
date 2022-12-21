import java.util.Scanner;

public class Matrix {
    private int[][] matrix = new int[10][10];
    private int col;
    private int row;

    public Matrix(int k, int r) {
        Scanner sc = new Scanner(System.in);
        this.col = k;
        this.row = r;
        System.out.println("fill in the matrix");

        for(int i = 0; i < this.col; ++i) {
            for(int j = 0; j < this.row; ++j) {
                int num = sc.nextInt();
                this.matrix[i][j] = num;
            }
        }

    }

    public void outMatrix() {
        for(int i = 0; i < this.col; ++i) {
            for(int j = 0; j < this.row; ++j) {
                System.out.println(this.matrix[i][j] + " ");
            }

            System.out.println();
        }

    }

    public void matrixSum(Matrix mt) {
        if (this.col == mt.col && this.row == mt.row) {
            for(int i = 0; i < this.col; ++i) {
                for(int j = 0; j < this.row; ++j) {
                    int[] var10000 = this.matrix[i];
                    var10000[j] += mt.matrix[i][j];
                }
            }
        } else {
            System.out.println("The dimensions of the matrices are not equal, element-by-element addition is impossible\n");
        }

    }
}

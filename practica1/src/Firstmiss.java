


import java.util.Arrays;
import java.util.Scanner;


public class Firstmiss {
    public static void main(String[] args) {
        double sum = 0;
        Scanner scanner = new Scanner (System.in);
        System.out.println("Введите элементы массива:");
        //int[] b = {1,2,3,4,5,6,7,8,9,10};
        int[] b = new int[10];
        for (int i=0; i < b.length; i++){
            b[i]= scanner.nextInt();
            sum = sum + b[i];
        }
        System.out.println("Сумма чисел:");
        System.out.println(sum);
        System.out.println("Среднее число:");
        System.out.println(sum/b.length);

    }
}

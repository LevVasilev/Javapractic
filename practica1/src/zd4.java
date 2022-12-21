

import java.util.Scanner;
public class zd4 {
    public static void main(String[] args) {
        double sum = 0;
        Scanner scanner = new Scanner (System.in);
        System.out.println("Введите элементы массива:");
        int[] b = new int[10];
        for (int i=0; i < b.length; i++){
            b[i]= scanner.nextInt();

        }
        int max=b[0];
        int min=b[0];
        int i=0 ;
        while  (i < b.length){
            sum = sum + b[i];

            if(b[i] < min ){
                min = b[i];
            }
            if (b[i] > max){
                max = b[i];

            }
            i++;
        }
        System.out.println("Сумма чисел:");
        System.out.println(sum);
        System.out.println("Максимальное число:");
        System.out.println(max);
        System.out.println("Минимальное число:");
        System.out.println(min);
    }
}

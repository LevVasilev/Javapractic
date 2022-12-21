
import java.util.ArrayList;
import java.util.Scanner;

public class Tester
{
    public static void main(String[] args)
    {
        ArrayList<Circle> mas = new ArrayList<Circle>();
        int count;
        double r;
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите количество элементов в массиве:");
        count = sc.nextInt();

        Point point = new Point();
        Circle circle = new Circle();

        for (int i = 0; i < count; i++)
        {
            point = new Point();
            System.out.println("Введите координату x,y центра окружности и ее радиус:");
            point.setX(sc.nextDouble());
            point.setY(sc.nextDouble());
            r = sc.nextDouble();
            circle = new Circle(point, r);
            mas.add(circle);
        }

        System.out.println("Полученный массив:");
        for (int i = 0; i < count; i++)
        {
            System.out.println(mas.get(i).toString() + "\n");
        }
    }

}

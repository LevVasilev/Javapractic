import java.util.Scanner;

public class CircleTest
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Circle circle = new Circle();
        Circle circle2 = new Circle();

        System.out.println("Введите радиус первой окружности, координаты ее центра (x и y):");
        circle.setR(sc.nextDouble());
        circle.setX(sc.nextDouble());
        circle.setY(sc.nextDouble());

        System.out.println("Введите радиус второй окружности, координаты ее центра (x и y):");
        circle2.setR(sc.nextDouble());
        circle2.setX(sc.nextDouble());
        circle2.setY(sc.nextDouble());

        System.out.println("Длина первой окружности: " + circle.circleLen() + "; Площадь первой окружности: " + circle.circleSquare());
        System.out.println("Длина первой окружности: " + circle2.circleLen() + "; Площадь первой окружности: " + circle2.circleSquare());

        System.out.println("Итог сравенения окружностей: " + circle.compare(circle.getR(), circle2.getR() ));
    }
}
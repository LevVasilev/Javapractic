
import java.util.ArrayList;
import java.util.Scanner;

public class TestShop
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        ArrayList<PC> mas = new ArrayList<PC>();
        Shop shp = new Shop(mas);
        int choise, count = 0;

        do
        {
            System.out.println("Все параметры писать СЛИТНО");
            System.out.println("Выберете действие:");
            System.out.println("1. Добавить компьютер в список");
            System.out.println("2. Удалить компьютер из списка");
            System.out.println("3. Найти компьютер по параметрам");
            System.out.println("4. Вывести список компьютеров");
            System.out.println("5. Закончить работу с программой");
            choise = sc.nextInt();

            switch (choise)
            {
                case 1:
                    shp.add_pc();
                    count++;
                    System.out.println();
                    break;
                case 2:
                    shp.remove_pc();
                    System.out.println();
                    count--;
                    break;
                case 3:
                    shp.search();
                    System.out.println();
                    break;
                case 4:
                    for (int i = 0; i < count; i++) System.out.println(shp.toString(i));
                    break;
                default:
                    break;
            }
        }while(choise != 5);


    }
}

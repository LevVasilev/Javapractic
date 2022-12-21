import java.util.ArrayList;
import java.util.Scanner;

public class Dogkennel
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        ArrayList<Dog> mas = new ArrayList<Dog>();
        int choise = 0;

        do
        {
            System.out.println("Выберете действие: ");
            System.out.println("1. Добавить собаку в список");
            System.out.println("2. Вывести список собак");
            System.out.println("3. Расчитать человеческий возраст собаки");
            System.out.println("4. Закончить работу программы");
            choise = sc.nextInt();

            switch (choise)
            {
                case 1:
                    Dog dog = new Dog();
                    System.out.println("Введите кличку собаки:");
                    dog.setName(sc.next());
                    System.out.println("Введите возраст собаки:");
                    dog.setAge(sc.nextInt());
                    mas.add(dog);
                    break;
                case 2:
                    for (int i = 0; i < mas.size(); i++)
                    {
                        System.out.println(mas.get(i).toString());
                    }
                    break;
                case 3:
                    Dog dog2 = new Dog();
                    System.out.println("Введите кличку собаки:");
                    dog2.setName(sc.next());
                    System.out.println("Введите возраст собаки:");
                    dog2.setAge(sc.nextInt());
                    System.out.println("Человеческий возраст собаки: " + dog2.toHumanAge());
                default:
                    break;
            }

        }while(choise != 4);
    }
}

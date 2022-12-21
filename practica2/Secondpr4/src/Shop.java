import java.util.ArrayList;
import java.util.Scanner;

public class Shop
{
    private ArrayList<PC> mas;
    private Scanner sc = new Scanner(System.in);

    public Shop (ArrayList<PC> mas)
    {
        this.mas = mas;

    }

    public void add_pc()
    {
        PC pc = new PC();
        System.out.print("Введите название компьютера: ");
        pc.setName(sc.next());
        System.out.print("Введите количество оперативной памяти: ");
        pc.setRam(sc.nextInt());
        System.out.print("Введите название процессора: ");
        pc.setCpu(sc.next());
        System.out.print("Введите название видеокарты: ");
        pc.setGpu(sc.next());
        mas.add(pc);
        System.out.println("\n");
        System.out.println("Объект добавлен");
    }

    public void remove_pc()
    {
        PC pc2 = new PC();
        System.out.print("Введите название компьютера: ");
        pc2.setName(sc.next());
        System.out.print("Введите количество оперативной памяти: ");
        pc2.setRam(sc.nextInt());
        System.out.print("Введите название процессора: ");
        pc2.setCpu(sc.next());
        System.out.print("Введите название видеокарты: ");
        pc2.setGpu(sc.next());
        System.out.println("\n");
        for (int i = 0; i < mas.size(); i++)
        {
            if (mas.get(i).getName().equals(pc2.getName()) & mas.get(i).getRam() == pc2.getRam() & mas.get(i).getCpu().equals(pc2.getCpu()) & mas.get(i).getGpu().equals(pc2.getGpu())) {
                mas.remove(mas.get(i));
                System.out.println("Объект удален");
                return;
            }
        }
        System.out.println("Объект отустсвует в списке");
    }

    public void search()
    {
        PC pc3 = new PC();
        int count = 0;
        System.out.print("Введите количество оперативной памяти: ");
        pc3.setRam(sc.nextInt());
        System.out.print("Введите название процессора: ");
        pc3.setCpu(sc.next());
        System.out.print("Введите название видеокарты: ");
        pc3.setGpu(sc.next());
        System.out.println("\n");

        for (int i = 0; i < mas.size(); i++)
        {
            if ((mas.get(i).getRam() == pc3.getRam()) & mas.get(i).getCpu().equals( pc3.getCpu()) & mas.get(i).getGpu().equals(pc3.getGpu()))
            {
                System.out.println(mas.get(i).toString());
                count++;
            }
        }
        if(count == 0) System.out.println("Подходящих компьютеров нет");
    }

    public String toString(int i)
    {
        return mas.get(i).toString() + "\n";
    }
}
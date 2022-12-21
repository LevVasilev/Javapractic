import java.util.ArrayList;
import java.util.Scanner;

public class Bookshelf
{
    private ArrayList<Book> mas = new ArrayList<Book>();
    private int size;
    private int count = 0;
    private Scanner sc = new Scanner(System.in);
    public Bookshelf(){}

    public void setMas(ArrayList<Book> mas) {
        this.mas = mas;
    }
    public ArrayList<Book> getMas() {
        return mas;
    }
    public void setSize(int size) {
        this.size = size;
    }
    public int getSize() {
        return size;
    }

    public void addBook()
    {
        if(size > count)
        {
            Book book = new Book();
            System.out.println("Введите название книги: ");
            if(count > 0) sc.nextLine();
            book.setName(sc.nextLine());
            System.out.println("Введите ФИО автора книги: ");
            book.setAuthor(sc.nextLine());
            System.out.println("Введите год написания книги: ");
            book.setDate(sc.nextInt());
            mas.add(book);
            count++;
            System.out.println("Книга стоит на полке");
        }
        else
        {
            System.out.println("Нельзя поставить больше книг на полку");
        }
    }

    public int oldDate()
    {
        int oldDate = 10000;
        for (int i = 0; i < count; i++)
        {
            if (mas.get(i).getDate() < oldDate) oldDate = mas.get(i).getDate();
        }
        return oldDate;
    }

    public int newDate()
    {
        int newDate = 0;
        for (int i = 0; i < count; i++)
        {
            if (mas.get(i).getDate() > newDate) newDate = mas.get(i).getDate();
        }
        return newDate;
    }

    public void bookSort()
    {
        Book book2 = new Book();
        for (int i = 0; i < count-1; i++)
        {
            for (int j = 0; j < count - i - 1; j++)
            {
                if(mas.get(j).getDate() > mas.get(j+1).getDate())
                {
                    book2 = mas.get(j);
                    mas.set(j,mas.get(j+1));
                    mas.set(j+1,book2);
                }
            }
        }
    }

    public String toString(int i)
    {
        return "Название книги: " + mas.get(i).getName() + "\n" + "Имя автора: " + mas.get(i).getAuthor() + "\n" + "Год написания: " + mas.get(i).getDate() + "\n";
    }
}
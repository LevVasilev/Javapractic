import java.util.Scanner;
public class BookTest
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Bookshelf bookshelf = new Bookshelf();
        int choise = 0;
        System.out.println("");

        System.out.println("Введите количество книг которе влезает на полку:");
        bookshelf.setSize(sc.nextInt());

        do
        {
            System.out.println("Выберете действие:");
            System.out.println("1. Добавить книгу на полку");
            System.out.println("2. Самая старая книга");
            System.out.println("3. Самая новая книга");
            System.out.println("4. Сортировать книги по ворзрастанию даты написания");
            System.out.println("5. Вывести список книг на полке");
            System.out.println("6. Выйти из программы");
            choise = sc.nextInt();

            switch (choise)
            {
                case 1:
                    bookshelf.addBook();
                    break;
                case 2:
                    System.out.println("Дата написания самой старой книги: " + bookshelf.oldDate());
                    break;
                case 3:
                    System.out.println("Дата написания самой новой книги: " + bookshelf.newDate());
                    break;
                case 4:
                    bookshelf.bookSort();
                    break;
                case 5:
                    for (int i = 0; i < bookshelf.getSize() ; i++)
                    {
                        System.out.println(bookshelf.toString(i));
                    }
                    break;
                default:
                    break;
            }

        }while(choise != 6);
    }
}
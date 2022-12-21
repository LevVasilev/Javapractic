public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Reader rd = new Reader("Иванов А. В.", 124, "МГУ", "30.06.2000", "89754255445");
        System.out.println(rd);
        rd.takeBook(2);
        rd.takeBook(new Book[]{new Book("Детство", "Толстой"), new Book("Капитанская дочка", "Пушкин")});
        rd.returnBook(3);
        rd.returnBook(new Book[]{new Book("Герой нашего времени", "Лермонтов"), new Book("Война и мир", "Толстой"), new Book("Преступление и наказание", "Достоевский ")});
    }
}
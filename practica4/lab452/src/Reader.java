
public class Reader {
    private String fio;
    private int id;
    private String facul;
    private String birthDay;
    private String number;

    public Reader(String fio, int id, String facul, String birthDay, String number) {
        this.fio = fio;
        this.id = id;
        this.facul = facul;
        this.birthDay = birthDay;
        this.number = number;
    }

    public void takeBook(int num) {
        System.out.println(this.fio + " take " + num + " books");
    }

    public void takeBook(Book... books) {
        System.out.println(this.fio + " take books: ");
        Book[] var2 = books;
        int var3 = books.length;

        for(int var4 = 0; var4 < var3; ++var4) {
            Book bk = var2[var4];
            System.out.println(bk);
        }

    }

    public void returnBook(int num) {
        System.out.println(this.fio + " return" + num + " books");
    }

    public void returnBook(Book... books) {
        System.out.println(this.fio + " return books: ");
        Book[] var2 = books;
        int var3 = books.length;

        for(int var4 = 0; var4 < var3; ++var4) {
            Book bk = var2[var4];
            System.out.println(bk);
        }

    }

    public String toString() {
        return "Reader{fio='" + this.fio + "', id=" + this.id + ", facul='" + this.facul + "', birthDay='" + this.birthDay + "', number='" + this.number + "'}";
    }
}

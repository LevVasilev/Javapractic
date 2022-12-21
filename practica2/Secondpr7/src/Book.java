public class Book
{
    private String author = "";
    private String name = "";
    private int date = 0;

    public Book(){};

    public Book(String name, String author, int date)
    {
        this.author = author;
        this.name = name;
        this.date = date;
    }

    public String getAuthor() {
        return author;
    }
    public String getName() {
        return name;
    }
    public int getDate() {
        return date;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setDate(int date) {
        this.date = date;
    }

}
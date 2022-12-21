public class Book implements Printable {
    private String name;

    public Book(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void print() {
        System.out.println("Printing book: " + this.getName());
    }

    public String toString() {
        return "Book{name='" + this.name + "'}";
    }
}


public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Shape s1 = new Circle(3.0, "Circle");
        Shape s2 = new Rectangle(5.0, 4.0, "Rectangle");
        System.out.println("" + s1 + s1.getType());
        System.out.println("" + s2 + s2.getType());
    }
}
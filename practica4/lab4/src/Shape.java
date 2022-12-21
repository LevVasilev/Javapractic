
public class Shape {
    private String name;

    public Shape(String name) {
        this.name = name;
    }

    public String getType() {
        return this.name;
    }

    public String toString() {
        return "Shape:" + this.name;
    }
}
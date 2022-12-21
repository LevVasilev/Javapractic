public class Person {
    private String fullName;
    private int age;

    public Person() {
    }

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void move() {
        System.out.println("Person " + this.fullName + " move");
    }

    public void talk() {
        System.out.println("Person " + this.fullName + " talk");
    }

    public String toString() {
        return this.fullName + " " + this.age;
    }
}

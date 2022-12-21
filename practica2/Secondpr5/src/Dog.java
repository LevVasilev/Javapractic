public class Dog
{
    private String name = "";
    private int age = 0;

    public Dog(){}

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public int toHumanAge()
    {
        return age * 7;
    }

    public String toString()
    {
        return "Имя - " + name + "; Возраст - " + age + "\n";
    }
}
public class Test {
    public Test() {
    }

    public static void main(String[] args) {
        Person p1 = new Person("Ivan");
        Person p2 = new Person("Ilya");
        Pet pet1 = new Pet("Sharik");
        Pet pet2 = new Pet("Shuchka");
        Nameable[] names = new Nameable[]{p1, p2, pet1, pet2};
        Nameable[] var6 = names;
        int var7 = names.length;

        for(int var8 = 0; var8 < var7; ++var8) {
            Nameable name = var6[var8];
            System.out.println(name);
        }

    }
}
public class Test {
    public Test() {
    }

    public static void main(String[] args) {
        Pupil[] arr = new Pupil[]{new Student("Pasha"), new Schooled("Sasha"), new Schooled("Viva"), new Student("Kolya"), new Student("Andrew")};
        System.out.println("Students:");

        int i;
        for(i = 0; i < 5; ++i) {
            if (arr[i].getClass().toString().equals("class ru.mire.lab4_11.Student")) {
                System.out.println(arr[i].getName());
            }
        }

        System.out.println("Schooled:");

        for(i = 0; i < 5; ++i) {
            if (arr[i].getClass().toString().equals("class ru.mire.lab4_11.Schooled")) {
                System.out.println(arr[i].getName());
            }
        }

    }
}
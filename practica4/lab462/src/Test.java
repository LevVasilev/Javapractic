public class Test {
    public Test() {
    }

    public static void main(String[] args) {
        Employer[] emps = new Employer[]{new Manager("vasya", "pushkin", 123455, 1234.0), new Employer("sasha", "ivanov", 32145), new Manager("tom", "hollms", 56894, 3552.0), new Employer("ivan", "kolyma", 12533), new Employer("sherlok", "smirnov", 78945)};
        Employer[] var2 = emps;
        int var3 = emps.length;

        for(int var4 = 0; var4 < var3; ++var4) {
            Employer emp = var2[var4];
            System.out.println(emp.getIncome());
        }

    }
}
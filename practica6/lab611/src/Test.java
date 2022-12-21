public class Test {
    public Test() {
    }

    public static void main(String[] args) {
        Farengeit f1 = new Farengeit(41.0);
        Kelvin k1 = new Kelvin(45.0);
        System.out.println("41 TC -> " + f1.convert() + " TF");
        System.out.println("45 TC -> " + k1.convert() + " TK");
    }
}
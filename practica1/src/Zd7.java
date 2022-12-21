public class Zd7 {
    public static int faktorial (int a){
        int fk =a;
        int i=1;
        while ((a-i)>0){
            fk = fk * (a - i);
            i++;

        }
        return fk ;
    }
    public static void main(String[] args) {
        int f = faktorial(4);
        System.out.println(f);
    }
}
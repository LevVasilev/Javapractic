public class Massive {

    public static void main(String[] args){

        String[] a = { "NFT "," and  "," crypto "," community "," the "," best "," choice "};

        for (int i=0; i<a.length; i++){
            System.out.print(a[i]);
        }
        System.out.println();

        int n = a.length;
        //Переменная, которая будет использоваться при обмене элементов
        String temp;

        for (int i = 0; i < n/2; i++) {
            temp = a[n-i-1];
            a[n-i-1] = a[i];
            a[i] = temp;
        }

        for (int i=0; i<a.length; i++){
            System.out.print(a[i]);
        }
    }
}
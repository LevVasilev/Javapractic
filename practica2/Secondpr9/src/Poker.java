import java.util.ArrayList;
import java.util.Scanner;

public class Poker
{
    public static void main(String[] args)
    {
        int n;
        int r;
        ArrayList<String> deck = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите количество игроков");
        do {
            n = sc.nextInt();
            sc.nextLine();

            if (n > 10) System.out.println("Игроков слишком много, карт не хватит. Повторите ввод");
            else break;
        }while(true);

        for (int i = 0; i < 52; i++)
        {
            deck.add("");
        }

        for (int i = 0; i < 52; i++)
        {
            if (i < 13)
            {
                switch (i) {
                    case 9:
                        deck.set(i,"J|ч");
                        break;
                    case 10:
                        deck.set(i,"D|ч");
                        break;
                    case 11:
                        deck.set(i,"K|ч");
                        break;
                    case 12:
                        deck.set(i,"A|ч");
                        break;
                    default:
                        deck.set(i,i + 2 + "|ч");
                }
            }
            if (i < 26 & i > 12)
            {
                switch (i) {
                    case 22:
                        deck.set(i,"J|б");
                        break;
                    case 23:
                        deck.set(i,"D|б");
                        break;
                    case 24:
                        deck.set(i,"K|б");
                        break;
                    case 25:
                        deck.set(i,"A|б");
                        break;
                    default:
                        deck.set(i,i - 11 + "|б");
                }
            }
            if (i < 39 & i > 25)
            {
                switch (i) {
                    case 35:
                        deck.set(i,"J|п");
                        break;
                    case 36:
                        deck.set(i,"D|п");
                        break;
                    case 37:
                        deck.set(i,"K|п");
                        break;
                    case 38:
                        deck.set(i,"A|п");
                        break;
                    default:
                        deck.set(i,i - 24 + "|п");
                }
            }
            if (i > 38)
            {
                switch (i) {
                    case 48:
                        deck.set(i,"J|k");
                        break;
                    case 49:
                        deck.set(i,"D|k");
                        break;
                    case 50:
                        deck.set(i,"K|k");
                        break;
                    case 51:
                        deck.set(i,"A|k");
                        break;
                    default:
                        deck.set(i,i - 37 + "|k");
                }
            }
        }


        for (int i = 0; i < n*5; i++)
        {
            r = (int) (Math.random() * deck.size());
            if(i % n == 0) System.out.println();
            System.out.print(" " + deck.get(r));
            deck.remove(r);
            if((i+1) % n != 0) System.out.print("  | ");
        }
    }
}

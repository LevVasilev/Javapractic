
public class Main {
    public static void main(String[] args) {
        Clothes[] cloth={
                new TShirt(SizeClose.S,"желтый",1000),
                new Pants(SizeClose.XXS,"синий",2000),
                new Skirt(SizeClose.XS,"оранжевый",3000),
                new Tie(SizeClose.M,"красный",200)

        };

        new Atelier().dressMan2(cloth);
        new Atelier().dressWoman2(cloth);

    }
}

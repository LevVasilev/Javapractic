public class Atelier  {




    public  void dressMan2(Clothes[] clothes) {
        for(Clothes thing :clothes )
            if(thing instanceof MenClothing){
                System.out.println(thing);
                System.out.println(((MenClothing) thing).dressMan());
            }


    }
    public  void dressWoman2(Clothes[] clothes) {
        for(Clothes thing :clothes )
            if(thing instanceof WomanClothing){
                System.out.println(thing);
                System.out.println(((WomanClothing) thing).dressWoman());
            }

    }
}

public class TShirt extends Clothes implements MenClothing,WomanClothing{


    public TShirt(SizeClose size, String color, double prise) {
        super(size, color, prise, "TShirt");
    }

    @Override
    public String dressMan() {
        return "Мужчина одел "+ getName()+ " " + getSize().getDescription();
    }

    @Override
    public String dressWoman() {
        return "Женщина одела "+ getName()+ " "+getSize().getDescription();
    }
}

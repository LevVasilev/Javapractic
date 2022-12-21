public class Pants extends Clothes implements MenClothing,WomanClothing {


    public Pants(SizeClose size, String color, double prise) {
        super(size, color, prise, "Pants");
    }

    @Override
    public String dressMan() {
        return "Мужчина одел "+ getName()+ " "+getSize().getDescription();
    }

    @Override
    public String dressWoman() {
        return "Женщина одела "+ getName()+" "+ getSize().getDescription();

    }
}


public class Tie extends Clothes implements MenClothing{
    public Tie(SizeClose size, String color, double prise) {
        super(size, color, prise, "Tie");
    }


    @Override
    public String dressMan() {
        return "Мужчина одел "+ getName()+ " "+getSize().getDescription();
    }
}

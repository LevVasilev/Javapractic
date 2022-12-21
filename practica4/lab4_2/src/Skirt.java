public  class Skirt extends Clothes implements MenClothing,WomanClothing {

    public Skirt(SizeClose size, String color, double prise) {
        super(size, color, prise, "Skirt");
    }

    @Override
    public String dressMan() {
        return "Мужчина одел "+ getName()+""+ getSize().getDescription();
    }

    @Override
    public String dressWoman() {
        return "Женщина одела "+ getName()+ " "+ getSize().getDescription();
    }
}




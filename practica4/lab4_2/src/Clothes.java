public abstract class Clothes {
    private final SizeClose size;
    private final String color;
    private final double prise;
    private final String name;

    public Clothes(SizeClose size,String color,double prise,String name){
        this.size=size;
        this.color=color;
        this.prise=prise;
        this.name = name;
    }
    public SizeClose getSize(){
        return size;
    }
    public String getColor(){
        return color;
    }
    public double getPrise(){
        return prise;
    }
    public String getName(){return name;}




    @Override
    public String toString(){
        return "Одежда(" + "размер: "+ size+" цена: "+ prise+" цвет: " +color + " название вещи: " + name+  ")";
    }


}


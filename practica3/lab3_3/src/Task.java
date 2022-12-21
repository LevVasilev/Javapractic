

public class Task {


    public static void main(String args[]){
        Double double1 = Double.valueOf(5.4568765464);
        Double double2 = Double.valueOf("38");
        System.out.println("1)Объекты класса Double,с помощью методов valueOf()\n" + double2);

        String str = "50";
        double value = Double.parseDouble(str);
        System.out.println("\n2)Преобразовать значение типа String к типу double:\n" + value);

        double a;
        a = double1;
        short s = (short) a;
        byte b = (byte) a;
        long l = (long) a;
        float f =(float) a;
        String st = "" + double1;
        System.out.println("\n3,4)Преобразовать объект класса Double ко всем примитивным типам.\n" +
                "Вывести значение объекта Double на консоль\n"+s+"\n"+b+"\n"+l+"\n"+f+"\n"+st+"\n");
        String d =Double.toString(double1);
        System.out.println("5)Преобразовать литерал типа double к строке: String d =\n" +
                "Double.toString(3.14)\n" + d);


    }

}

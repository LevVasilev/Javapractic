
public class Main {
    public static void main(String[] args) {

        Computer[] comp = {
                new Memory(Mark.LENOVO,"black",256,"memory"),
                new Monitor(Mark.ISUS,"white",27,"monitor"),
                new Processor(Mark.SUMSUNG,"blue",37.5,"processor")
        };

        new all().print(comp);
    }
}
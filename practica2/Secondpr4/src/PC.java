public class PC
{
    private String name = "";
    private int ram = 0;
    private String cpu = "";
    private String gpu = "" ;

    public PC(String name, int ram, String cpu, String gpu)
    {
        this.name = name;
        this.ram = ram;
        this.cpu = cpu;
        this.gpu = gpu;
    }

    public PC(){}
    public String toString()
    {
        return "Название компьютера: " + name + "\nКол-во оперативной памяти: " + ram + "\nНазвание процессора: " + cpu + "\nНазвание видеокарты: " + gpu;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }
    public void setGpu(String gpu) {
        this.gpu = gpu;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getName() {
        return name;
    }
    public int getRam() {
        return ram;
    }
    public String getCpu() {
        return cpu;
    }
    public String getGpu() {
        return gpu;
    }
}

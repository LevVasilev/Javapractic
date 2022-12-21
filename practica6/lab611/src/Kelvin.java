public class Kelvin implements Convertable {
    private double cem;

    public double getCem() {
        return this.cem;
    }

    public void setCem(double cem) {
        this.cem = cem;
    }

    public Kelvin(double cem) {
        this.cem = cem;
    }

    public double convert() {
        return this.cem + 273.15;
    }
}
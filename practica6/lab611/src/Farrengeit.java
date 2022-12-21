class Farengeit implements Convertable {
    private double cem;

    public Farengeit(double cem) {
        this.cem = cem;
    }

    public double getCem() {
        return this.cem;
    }

    public void setCem(double cem) {
        this.cem = cem;
    }

    public double convert() {
        return 1.8 * this.cem + 32.0;
    }
}

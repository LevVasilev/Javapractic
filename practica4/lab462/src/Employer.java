public class Employer {
    private String firsName;
    private String secondName;
    private int income;

    public Employer(String firsName, String secondName, int income) {
        this.firsName = firsName;
        this.secondName = secondName;
        this.income = income;
    }

    public double getIncome() {
        return (double)this.income;
    }
}
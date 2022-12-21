public class Manager extends Employer {
    private double averageSum;

    public Manager(String firsName, String secondName, int income, double averageSum) {
        super(firsName, secondName, income);
        this.averageSum = averageSum;
    }
    public double getIncome() {
        return super.getIncome() + this.averageSum;
    }
}
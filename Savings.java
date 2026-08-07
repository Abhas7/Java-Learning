public class Savings extends Account {
    private double interestRate;

    public Savings() {
        super();
        this.interestRate = 0.05;
    }

    public Savings(double balance) {
        super(balance);
        this.interestRate = 0.05;
    }

    public Savings(double balance, double interestRate) {
        super(balance);
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }
}

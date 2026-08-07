public class Current extends Account {
    private double overdraftLimit;

    public Current() {
        super();
        this.overdraftLimit = 1000.0;
    }

    public Current(double balance) {
        super(balance);
        this.overdraftLimit = 1000.0;
    }

    public Current(double balance, double overdraftLimit) {
        super(balance);
        this.overdraftLimit = overdraftLimit;
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    public void setOverdraftLimit(double overdraftLimit) { 
        this.overdraftLimit = overdraftLimit;
    }
}

package ua.univer.Task7;

public abstract class Deposit {
    private double depositAmount;
    private int depositPeriod;

    public double amount() {
        return depositAmount;
    }

    public int period() {
        return depositPeriod;
    }

    protected Deposit(double depositAmount, int depositPeriod) {
        this.depositAmount = depositAmount;
        this.depositPeriod = depositPeriod;
    }

    abstract double income();
}

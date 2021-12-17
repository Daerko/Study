package ua.univer.Task7;

public class BaseDeposit extends Deposit {

    public BaseDeposit(double amount, int period) {
        super(amount, period);
    }

    @Override
    public double income() {
        double result = super.amount();
        for (int i = 0; i < super.period(); i++) {
            result *= 1.05;
        }
        result *= 100.0;
        Math.round(result);
        result /= 100.0;
        return result - super.amount();
    }
}

package ua.univer.Task7;

public class SpecialDeposit extends Deposit{

    public SpecialDeposit(double amount, int period) {
        super(amount, period);
    }

    @Override
    public double income() {
        double result = super.amount();
        for (int i = 1; i <= period(); i++) {
            result *= 1.0 + (i / 100.0);
        }
        result *= 100.0;
        Math.round(result);
        result /= 100.0;
        return result - super.amount();
    }
}

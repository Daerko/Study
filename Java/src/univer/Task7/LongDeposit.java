package univer.Task7;

public class LongDeposit extends Deposit {

    public LongDeposit(double amount, int period) {
        super(amount, period);
    }

    @Override
    public double income() {
        double result = super.amount();
        for (int i = 0; i < period() - 6; i++) {
            result *= 1.15;
        }
        result *= 100.0;
        Math.round(result);
        result /= 100.0;
        return result - super.amount();
    }
}

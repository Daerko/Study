package ua.univer.Task6;

import java.math.BigDecimal;

public class Manager extends Employee {

    private int quantity;

    public Manager(String surname, BigDecimal salary, int clientAmount) {
        super(surname, salary);
        this.quantity = clientAmount;
    }

    @Override
    public void setBonus(BigDecimal bonus) {
        if (quantity > 100) {
            setBonus(getBonus().multiply(BigDecimal.valueOf(500)));
        }
        else if (quantity > 150) {
            setBonus(getBonus().multiply(BigDecimal.valueOf(1000)));
        }
    }
}

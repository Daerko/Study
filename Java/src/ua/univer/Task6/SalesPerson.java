package ua.univer.Task6;

import java.math.BigDecimal;

public class SalesPerson extends Employee{

    private int percent;

    public SalesPerson(String surname, BigDecimal salary, int percent) {
        super(surname, salary);
        this.percent = percent;
    }

    @Override
    public void setBonus(BigDecimal bonus) {
        if(percent > 100){
            this.setBonus(getBonus().multiply(BigDecimal.valueOf(2)));
        }
        else if(percent > 200){
            this.setBonus(getBonus().multiply(BigDecimal.valueOf(3)));
        }
    }
}

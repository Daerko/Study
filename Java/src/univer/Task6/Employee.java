package univer.Task6;

import java.math.BigDecimal;

public abstract class Employee {

    private String surname;
    private BigDecimal salary;
    private BigDecimal bonus = new BigDecimal("0");

    public String getSurname() {
        return surname;
    }

    public void setSurname() {
        this.surname = surname;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary() {
        this.salary = salary;
    }

    public Employee(String surname, BigDecimal salary) {
        this.surname = surname;
        this.salary = salary;
    }

    public BigDecimal getBonus() {
        return bonus;
    }

    public abstract void setBonus(BigDecimal bonus);

    public BigDecimal toPay() {
        return salary.add(bonus);
    }
}

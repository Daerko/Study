package ua.univer.Task6;

import java.math.BigDecimal;

public class Company {

    private Employee[] employees;

    public Company(Employee[] employees) {
        this.employees = employees;
    }

    public void giveEverbodyBonus(BigDecimal companyBonus) {
        for(Employee employee : employees)
            employee.setBonus(companyBonus);
    }

    public BigDecimal totalToPay() {
        BigDecimal sum = new BigDecimal("0");
        for (Employee employee : employees) {
            sum = sum.add(employee.toPay());
        }
        return sum;
    }

    public String nameMaxSalary() {
        String name = employees[0].getSurname();
        BigDecimal maxSal = employees[0].toPay();

        for (Employee employee : employees) {
            maxSal = maxSal.max(employee.toPay());
            if (maxSal.equals(employee.toPay())) {
                name = employee.getSurname();
            }
        }
        return name;
    }
}

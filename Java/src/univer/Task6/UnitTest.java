package univer.Task6;

import org.junit.jupiter.api.Test;
import java.math.BigDecimal;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class UnitTest {
    @Test
    void testSetBonus100() {
        Manager manager = new Manager("Korytnyi", new BigDecimal(15000), 101);
        manager.setBonus(new BigDecimal(1000));
        //manager.();
        assertEquals(new BigDecimal(500), manager.getBonus());
    }

    @Test
    void testSetBonus150() {
        Manager manager = new Manager("Korytnyi", new BigDecimal(15000), 160);
        manager.setBonus(new BigDecimal(1000));
        //manager.setBonus();
        assertEquals(new BigDecimal(1500), manager.getBonus());
    }

    @Test
    void testGiveEverbodyBonus() {
        SalesPerson person1 = new SalesPerson("Korytnyi", new BigDecimal(10_000), 120);
        SalesPerson person2 = new SalesPerson("Verkhovod", new BigDecimal(15_000), 260);
        Manager person3 = new Manager("Adamskiy", new BigDecimal(25_000), 160);
        Manager person4 = new Manager("Alopiy", new BigDecimal(20_000), 210);
        Company company = new Company(new Employee[]{person1, person2, person3, person4});
        company.giveEverbodyBonus(new BigDecimal(1000));
        assertEquals(new BigDecimal(1000), person1.getBonus());
        assertEquals(new BigDecimal(1000), person2.getBonus());
        assertEquals(new BigDecimal(1000), person3.getBonus());
        assertEquals(new BigDecimal(1000), person4.getBonus());

    }
    @Test
    void testNameMaxSalary() {
        SalesPerson person1 = new SalesPerson("Korytnyi", new BigDecimal(10_000), 120);
        SalesPerson person2 = new SalesPerson("Verkhovod", new BigDecimal(15_000), 260);
        Manager person3 = new Manager("Adamskiy", new BigDecimal(25_000), 160);
        Manager person4 = new Manager("Alopiy", new BigDecimal(20_000), 210);
        Company company = new Company(new Employee[]{person1, person2, person3, person4});
        String surname = company.nameMaxSalary();
        assertEquals(person3.getSurname(), surname);
    }
}

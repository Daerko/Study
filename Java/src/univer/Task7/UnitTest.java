package univer.Task7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UnitTest {
    @Test
    void testIncome() {
        BaseDeposit deposit = new BaseDeposit(10000.0, 12);

        double income = deposit.income();

        assertEquals(7958.563260221297, income, 0.01);
    }
    @Test
    void testAddDeposit() {
        Client client = new Client();
        assertTrue(client.addDeposit(new BaseDeposit(10000, 12)));

        for (int i = 0; i < 9; i++) {
            client.addDeposit(new LongDeposit(10000.0, 18));
        }
        assertFalse(client.addDeposit(new BaseDeposit(10000, 12)));
    }
    @Test
    void testTotalIncome() {
        Client client = new Client();
        client.addDeposit(new BaseDeposit(10000, 12));
        client.addDeposit(new SpecialDeposit(10000, 12));
        client.addDeposit(new LongDeposit(10000, 12));

        double total = client.totalIncome();

        assertEquals(32246.215031337928, total, 0.03);
    }
    @Test
    void testMaxIncome(){
        Client client = new Client();
        client.addDeposit(new BaseDeposit(10000, 12));
        client.addDeposit(new SpecialDeposit(10000, 12));
        client.addDeposit(new LongDeposit(10000, 12));

        double total = client.maxIncome();

        assertEquals(13130.607656249987, total, 0.03);
    }
    @Test
    void testGetIncomeByNumber(){
        Client client = new Client();
        client.addDeposit(new BaseDeposit(10000, 12));
        client.addDeposit(new SpecialDeposit(10000, 12));
        client.addDeposit(new LongDeposit(10000, 12));

        double total = client.getIncomeByNumber(3);

        assertEquals(13130.607656249987, total, 0.03);
    }
    @Test
    void testLIncome() {
        LongDeposit deposit = new LongDeposit(10000,12);

        double income = deposit.income();

        assertEquals(13130.607656249987, income, 0.01);
    }
    @Test
    void testSIncome() {
        SpecialDeposit deposit = new SpecialDeposit(10000.0, 12);

        double income = deposit.income();

        assertEquals(11157.044114866643, income, 0.01);
    }
}

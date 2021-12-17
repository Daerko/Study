package univer.Task9;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class UnitTest {
    @Test
    void testSetMatrixValue() {
        Matrix matrix = new  Matrix(new double[5][5]);

        matrix.setMatrixValue(3, 2, 7);

        assertEquals(0, matrix.getMatrixValue(1,0));
    }
    @Test
    void additionOfMatrix() {
        Matrix matrix = new  Matrix(new double[5][5]);

        matrix.additionOfMatrix();

        assertEquals(0, matrix.getMatrixValue(1,0));
    }

}

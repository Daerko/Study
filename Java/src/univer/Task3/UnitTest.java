package univer.Task3;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static ua.univer.Task3.FirstTask.isSorted;
import static ua.univer.Task3.FirstTask.isSortedDesc;
import static ua.univer.Task3.SecondTask.transformArr;

class UnitTest {
    @Test
    void testisSortedDescTrue() {
        int[] arr = {8, 7, 6, 5, 4, 3, 2, 1};
        boolean result = isSortedDesc(arr);
        assertTrue(result);
    }

    @Test
    void testisSortedDescFalse() {
        int[] arr = {8, 9, 6, 5, 4, 3, 2, 1};
        boolean result = isSortedDesc(arr);
        assertFalse(result);
    }

    @Test
    void testisSortedTrue() {
        int[] arr = {1, 2, 5, 5, 7, 8, 9, 10};
        boolean result = isSorted(arr);
        assertTrue(result);
    }
    @Test
    void testIsSortedFalse() {
        int[] arr = {1, 2, 5, 5, 7, 8, 9, 0};
        boolean result = isSorted(arr);
        assertFalse(result);
    }
    @Test
    void testTransformArrTrue(){
        int[] arr = {1, 2, 3, 4};
        transformArr(arr);
        assertArrayEquals(new int[]{1, 3, 5, 7}, arr);
    }
    @Test
    void testTransformArrFalse(){
        int[] arr = {1, 2, 3, 1};
        transformArr(arr);
        assertArrayEquals(new int[]{1, 3, 5, 4}, arr);
    }
    @Test
    void testMultiArithmeticElements(){
            long result = ThirdTask.MultiArithmeticElements(1,3);
            assertEquals(28, result);
        }
}



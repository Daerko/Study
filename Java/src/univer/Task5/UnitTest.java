package univer.Task5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UnitTest {
    @Test
    void testNumberMaxArea(){
        ArrayRectangles rectangles = new ArrayRectangles(3);
        rectangles.addRectangle(new Rectangle(5, 7));
        rectangles.addRectangle(new Rectangle(8));
        rectangles.addRectangle(new Rectangle());
        assertEquals(1, rectangles.numberMaxArea());
    }
    @Test
    void testNumberMinPerimeter(){
        ArrayRectangles rectangles = new ArrayRectangles(3);
        rectangles.addRectangle(new Rectangle(6, 7));
        rectangles.addRectangle(new Rectangle(5));
        rectangles.addRectangle(new Rectangle());
        assertEquals(2, rectangles.numberMinPerimeter());
    }
    @Test
    void testNumberSquare(){
        ArrayRectangles rectangles = new ArrayRectangles(3);
        rectangles.addRectangle(new Rectangle(1, 4));
        rectangles.addRectangle(new Rectangle(2));
        rectangles.addRectangle(new Rectangle());
        assertEquals(0, rectangles.numberSquare());
    }

}



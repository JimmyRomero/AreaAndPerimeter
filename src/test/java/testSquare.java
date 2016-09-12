import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Test for Square {@link Square}
 */

public class testSquare {

    public static final double DELTA = 0.001;

    private Shape shape;

    @Before 
    public void setUp() {
        double side = 4;
        shape = new Square(side);
    }

    @Test
    public void test_calculateArea_square() {
        final double expectedResult = 16;
        assertEquals(expectedResult, shape.calculateArea(), DELTA);
    }

    @Test
    public void test_calculatePerimeter_square() {
        final double expectedResult = 16;
        assertEquals(expectedResult, shape.calculatePerimeter(), DELTA);
    }
}

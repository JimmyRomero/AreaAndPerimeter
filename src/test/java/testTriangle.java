import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Test for Triangle {@link Triangle}
 */

public class testTriangle {

    private static final double DELTA = 0.001;

    private Shape shape;

    @Before
    public void setUp() {
        int base = 4;
        int high = 2;
        int side = 3;

        shape = new Triangle(base, high, side);
    }

    @Test
    public void test_calculateArea_triangle() {
        final double expectedResult = 4;
        assertEquals(expectedResult, shape.calculateArea(), DELTA);
    }

    @Test
    public void test_calculatePerimeter_triangle() {
        final double expectedResult = 9;
        assertEquals(expectedResult, shape.calculatePerimeter(), DELTA);
    }
}

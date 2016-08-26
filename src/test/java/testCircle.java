import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Test for Circle {@link Circle}
 */

public class testCircle {

    private static final double DELTA = 0.001;

    private Shape shape;

    final int radio = 2;

    @Before
    public void setUp() {
        shape = new Circle(radio);
    }

    @Test
    public void test_calculateArea_circle() {
        final double expectedResult = 12.566370614359172;
        assertEquals(expectedResult, shape.calculateArea(), DELTA);
    }

    @Test
    public void test_calculatePerimeter_circle() {
        final double expectedResult = 12.566370614359172;
        assertEquals(expectedResult, shape.calculatePerimeter(), DELTA);
    }
}

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by JimmyRomero on 9/6/2016.
 */
public class testRectangle {

    public static final double DELTA = 0.001;

    private Shape shape;

    @Before
    public void setUp() {
        double sideA = 5;
        double sideB = 10;
        shape = new Rectangle(sideA, sideB);
    }

    @Test
    public void test_calculateArea_square() {
        final double expectedResult = 50;
        assertEquals(expectedResult, shape.calculateArea(), DELTA);
    }

    @Test
    public void test_calculatePerimeter_square() {
        final double expectedResult = 30;
        assertEquals(expectedResult, shape.calculatePerimeter(), DELTA);
    }
}

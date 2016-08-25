import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by JimmyRomero on 8/25/2016.
 */
public class testCircle {
    Shape circle;

    @Test
    public void test_calculateArea_circle()
    {
        circle = new Circle(2.0);
        double expectedResult = 12.566370614359172;
        assertEquals(expectedResult, circle.calculateArea());
    }

    @Test
    public void test_calculatePerimeter_circle()
    {
        circle = new Circle(2.0);
        double expectedResult = 12.566370614359172;
        assertEquals(expectedResult, circle.calculatePerimeter());
    }
}

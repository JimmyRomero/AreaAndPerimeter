import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by JimmyRomero on 8/25/2016.
 */
public class testTriangle {
    Shape triangle;

    @Test
    public void test_calculateArea_triangle(){
        triangle = new Triangle(4,2,3);
        double expectedResult = 4;
        assertEquals(expectedResult, triangle.calculateArea());
    }

    @Test
    public void test_calculatePerimeter_triangle(){
        triangle = new Triangle(4,2,3);
        double expectedResult = 9;
        assertEquals(expectedResult, triangle.calculatePerimeter());
    }
}

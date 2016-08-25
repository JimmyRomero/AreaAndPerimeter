import org.junit.Test;

import static junit.framework.TestCase.assertEquals;


/**
 * Created by JimmyRomero on 8/25/2016.
 */
public class testSquare {
    Shape square;

    @Test
    public void test_calculateArea_square(){
        square = new Square(4);
        double expectedResult = 16;
        assertEquals(expectedResult, square.calculateArea());
    }

    @Test
    public void test_calculatePerimeter_square(){
        square = new Square(4);
        double expectedResult = 16;
        assertEquals(expectedResult, square.calculatePerimeter());
    }
}

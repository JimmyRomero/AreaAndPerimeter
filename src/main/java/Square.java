/**
 * Created by JimmyRomero on 8/24/2016.
 */
public class Square extends Shape {

    private final double side;

    public Square(double side) {
        this.side = side;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public double calculateArea() {
        return side * side;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public double calculatePerimeter() {
        return 4 * side;
    }
}

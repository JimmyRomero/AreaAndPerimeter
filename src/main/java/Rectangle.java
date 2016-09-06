/**
 * Created by JimmyRomero on 9/6/2016.
 */
public class Rectangle implements Shape {

    private final double sideA;
    private final double sideB;

    public Rectangle(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public double calculateArea() {
        return this.sideA * sideB;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public double calculatePerimeter() {
        return 2 * (this.sideA + this.sideB);
    }
}

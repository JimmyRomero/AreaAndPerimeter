/**
 * Created by JimmyRomero on 8/25/2016.
 */
public class Triangle implements Shape {

    private final double base, high, side;

    public Triangle(double base, double high, double side) {
        this.base = base;
        this.high = high;
        this.side = side;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public double calculateArea() {
        return (this.base * this.high) / 2;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public double calculatePerimeter() {
        return (this.side + this.side + this.side);
    }
}

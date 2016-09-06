/**
 * Calculates the area and perimeter
 */
public class Circle implements Shape {

    private final double radio;

    public Circle(double radio) {
        this.radio = radio;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(this.radio, 2);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * this.radio;
    }
}

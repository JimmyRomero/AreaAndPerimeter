/**
 * Calculates the area and perimeter
 */
public class Circle extends Shape {

    private final double radio;

    public Circle(double radio) {
        this.radio = radio;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(radio, 2);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radio;
    }
}

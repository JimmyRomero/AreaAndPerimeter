/**
 * Created by JimmyRomero on 8/25/2016.
 */
public class main {

    public static  void main(String[]args)
    {
        Shape circle = new Circle(2.0);
        double resCircleArea = circle.calculateArea();
        double resCirclePerimeter = circle.calculatePerimeter();
        System.out.println(resCircleArea);
        System.out.println(resCirclePerimeter);
    }
}

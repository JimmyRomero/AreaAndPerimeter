/**
* Created by JimmyRomero on 8/24/2016.
*/
public class Square extends Shape {

    double side;

    public Square(double side){
        this.side = side;

    }

    public double calculateArea(){
        return side * side;
    }
    public double calculatePerimeter(){
        return 4 * side;
    }
}

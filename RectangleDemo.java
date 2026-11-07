class Rectangle {

    double length;
    double width;

    void calculateArea() {
        System.out.println("Area: " + (length * width));
    }

    void calculatePerimeter() {
        System.out.println("Perimeter: " + (2 * (length + width)));
    } 
}

public class RectangleDemo {
    public static void main(String[] args) {

        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle();

        r1.length = 10;
        r1.width = 5;

        r2.length = 8;
        r2.width = 4;

       r1.calculateArea();
       r1.calculatePerimeter();
       r2.calculateArea();
       r2.calculateArea();
    }
}
// Question 2: Demo of the shapes package — Shape interface with Circle and Rectangle.

package shapes;

public class Question2 {
    public static void main(String[] args) {
        Shape circle = new Circle(5.0);
        Shape rectangle = new Rectangle(4.0, 6.0);

        System.out.println("Circle Area = " + circle.area());
        System.out.println("Circle Perimeter = " + circle.perimeter());
        System.out.println("Rectangle Area = " + rectangle.area());
        System.out.println("Rectangle Perimeter = " + rectangle.perimeter());
    }
}

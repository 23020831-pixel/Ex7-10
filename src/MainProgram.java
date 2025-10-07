/**
 * MainProgram
 */
import java.util.ArrayList;
import java.util.List;

public class MainProgram {
    public static void main(String[] args) {

        List<Shape> shapes = new ArrayList<>();

        shapes.add(new Rectangle(new Point(10, 20), 100, 50));
        shapes.add(new Circle(new Point(5, 15), 30));
        shapes.add(new Square(new Point(30, 30), 40));
        shapes.add(new Circle(new Point(-10, 0), 25));

        System.out.println("\n1. Số lượng hình đã khởi tạo: " + Shape.getCount());

        System.out.println("\n2. Danh sách chi tiết các hình đã khởi tạo:");
        for (Shape shape : shapes) {
            System.out.println("- " + shape.getInfo());
        }

        System.out.println("\n3. Danh sách tâm điểm:");
        for (Shape shape : shapes) {
            System.out.println("- Tâm của " + shape.getClass().getSimpleName() + ": " + shape.getCenterPoint());
        }
    }
}
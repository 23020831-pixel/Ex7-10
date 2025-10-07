/**
 * Circle class.
 */
public class Circle extends Shape {

    private int radius;

    public Circle(Point centerPoint, int radius) {
        super(centerPoint);
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    @Override
    public String getInfo() {
        return "Circle[Tâm=" + centerPoint + ", Bán kính=" + radius + "]";
    }
}

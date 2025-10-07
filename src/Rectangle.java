/**
 * Rectangle class.
 */
public class Rectangle extends Shape {
    private int width;
    private int height;

    public Rectangle(Point centerPoint, int width, int height) {
        super(centerPoint);
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public String getInfo() {
        return "Rectangle[Tâm=" + centerPoint + ", Rộng=" + width + ", Cao=" + height + "]";
    }
}
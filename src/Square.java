/**
 * Square class.
 */
public class Square extends Rectangle {
    public Square(Point centerPoint, int side) {

        super(centerPoint, side, side);
    }

    @Override
    public String getInfo() {
        return "Square[Tâm=" + getCenterPoint() + ", Cạnh=" + getWidth() + "]";
    }
}
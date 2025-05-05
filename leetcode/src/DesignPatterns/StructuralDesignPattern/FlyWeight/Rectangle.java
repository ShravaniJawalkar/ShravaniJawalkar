public class Rectangle implements Shape{
    private static final String shapeType = "Rectangle";

    @Override
    public void draw(String color) {
        System.out.println("Drawing a " + this.shapeType + " with color: " + color);
    }
}
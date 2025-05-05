public class Circle implements Shape {
    private static final String shapeType = "Circle";


    @Override
    public void draw(String color) {
        System.out.println("Drawing a " + this.shapeType + " with color: " + color);
    }

}
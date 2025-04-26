public class ShapeFactory {


    public static IShape getShape(String name) {
        if (name == null) {
            return null;
        } else if (name.equalsIgnoreCase("circle")) {
            return new Circle();
        } else if (name.equalsIgnoreCase("rectangle")) {
            return new Rectangle();
        }
        return null;
    }
}
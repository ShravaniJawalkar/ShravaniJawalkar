import java.util.*;

public class ShapeFactory {
    private static final Map<String, Shape> shapeMap = new HashMap<>();

    public static Shape getCircle() {
        return shapeMap.computeIfAbsent("Circle", k -> new Circle());
    }

    public static Shape getRectangle() {
        return shapeMap.computeIfAbsent("Rectangle", k -> new Rectangle());
    }
}
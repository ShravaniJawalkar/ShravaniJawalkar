public class ShapeFactoryUse {
    public static void main(String[] args){
        IShape shape =ShapeFactory.getShape("circle");
        shape.draw();
        IShape shape1 =ShapeFactory.getShape("rectangle");
        shape1.draw();
    }
}
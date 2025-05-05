public class FlyWeightDemo {
    public static void main(String args[]) {
        Shape circle1 = ShapeFactory.getCircle();
        circle1.draw("Blue");
        Shape circle2 = ShapeFactory.getCircle();
        circle2.draw("Red");
        System.out.println(circle1==circle2);

        Shape rect1 = ShapeFactory.getRectangle();
        rect1.draw("Blue");
        Shape rect2 = ShapeFactory.getRectangle();
        rect2.draw("Red");
        System.out.println(rect1==rect2);
    }
}
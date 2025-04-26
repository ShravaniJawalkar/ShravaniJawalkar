public class AbstractFurnitureFactoryDemo {
    public static void main(String[] args){

        FurnitureFactory victoriaFurnitureFactory = new VictorianFurnitureFactory();
        System.out.println(victoriaFurnitureFactory.createChair().sitOn());
        System.out.println(victoriaFurnitureFactory.createSofa().lieOn());
        FurnitureFactory modernFurnitureFactory = new ModernFurnitureFactory();
       System.out.println(modernFurnitureFactory.createChair().sitOn());
        System.out.println(modernFurnitureFactory.createSofa().lieOn());
    }
}
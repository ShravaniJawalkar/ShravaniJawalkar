public class BuilderPatternDemo {

    public static void main(String[] args){
        House house = new House.Builder()
                .windows(4)
                .doors(2)
                .hasGarage(true)
                .hasGarden(false)
                .hasSwimmingPool(true)
                .roofType("Gable")
                .build();

        System.out.println("House Details:");
        System.out.println("Windows: " + house.getWindows());
        System.out.println("Doors: " + house.getDoors());
        System.out.println("Garage: " + house.hasGarage());
        System.out.println("Garden: " + house.hasGarden());
        System.out.println("Swimming Pool: " + house.hasSwimmingPool());
        System.out.println("Roof Type: " + house.getRoofType());

    }
}
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

        DinningTable dinningTable = new DinningTable.Builder()
                .material("Wood")
                .shape("Round")
                .size("Large")
                .color("Brown")
                .numberOfSeats(4)
                .extendable(true)
                .build();
        System.out.println("\nDinning Table Details:");
        System.out.println("Material: " + dinningTable.getMaterial());
        System.out.println("Shape: " + dinningTable.getShape());
        System.out.println("Size: " + dinningTable.getSize());
        System.out.println("Color: " + dinningTable.getColor());
        System.out.println("Number of Seats: " + dinningTable.getNumberOfSeats());
        System.out.println("Extendable: " + dinningTable.isExtendable());
    }
}
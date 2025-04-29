public class DecoraterDemo {
    public static void main(String args[]){
        ToppingDecorator toppingDecorator = new CheesTopping(new MargritaPizza());
        System.out.println("Cost of "+toppingDecorator.getDescription()+": " + toppingDecorator.cost());

        toppingDecorator = new CheesTopping(new MashroomToppings(new MargritaPizza()));
        System.out.println("Cost of "+toppingDecorator.getDescription()+": " + toppingDecorator.cost());

        toppingDecorator = new CheesTopping(new VegetablesTopping(new MashroomToppings(new MargritaPizza())));
        System.out.println("Cost of "+toppingDecorator.getDescription()+": " + toppingDecorator.cost());

        // corn pizza
        toppingDecorator = new CheesTopping(new CornPizza());
        System.out.println("Cost of "+toppingDecorator.getDescription()+": " + toppingDecorator.cost());

        toppingDecorator = new CheesTopping(new MashroomToppings(new CornPizza()));
        System.out.println("Cost of "+toppingDecorator.getDescription()+": " + toppingDecorator.cost());

        toppingDecorator = new CheesTopping(new VegetablesTopping(new MashroomToppings(new CornPizza())));
        System.out.println("Cost of "+toppingDecorator.getDescription()+": " + toppingDecorator.cost());

        // FarmHouse pizza
        toppingDecorator = new CheesTopping(new FarmhousePizza());
        System.out.println("Cost of "+toppingDecorator.getDescription()+": " + toppingDecorator.cost());

        toppingDecorator = new CheesTopping(new MashroomToppings(new FarmhousePizza()));
        System.out.println("Cost of "+toppingDecorator.getDescription()+": " + toppingDecorator.cost());

        toppingDecorator = new CheesTopping(new VegetablesTopping(new MashroomToppings(new FarmhousePizza())));
        System.out.println("Cost of "+toppingDecorator.getDescription()+": " + toppingDecorator.cost());
    }
}
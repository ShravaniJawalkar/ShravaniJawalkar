public class MashroomToppings implements ToppingDecorator{

    private BasePizza basePizza;

    public MashroomToppings(BasePizza basePizza) {
        this.basePizza = basePizza;
    }

    @Override
    public int cost(){
        return this.basePizza.cost() + 30;
    }

    @Override
    public String getDescription(){
        return this.basePizza.getDescription()+", with Mashroom Toppings";
    }
}
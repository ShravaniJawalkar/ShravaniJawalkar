public class VegetablesTopping implements ToppingDecorator{

    private BasePizza basePizza;

    public VegetablesTopping(BasePizza basePizza) {
        this.basePizza = basePizza;
    }

    @Override
    public int cost(){
        return this.basePizza.cost() + 15;
    }

    @Override
    public String getDescription(){
        return this.basePizza.getDescription() + ", with Vegetables on top";
    }
}
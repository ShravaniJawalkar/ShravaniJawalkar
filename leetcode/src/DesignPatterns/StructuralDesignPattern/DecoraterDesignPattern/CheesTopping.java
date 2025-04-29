public class CheesTopping implements ToppingDecorator{

    private BasePizza basePizza;

    public CheesTopping(BasePizza basePizza) {
        this.basePizza = basePizza;
    }

    @Override
    public int cost() {
        return basePizza.cost() + 20;
    }
    @Override
    public String getDescription() {
        return basePizza.getDescription() + ", with extra Cheese";
    }
}
public class CornPizza implements BasePizza{

    @Override
    public int cost() {
        return 200;
    }

    @Override
    public String getDescription() {
        return "Corn Pizza";
    }
}
public class MargritaPizza implements BasePizza{

    @Override
    public int cost() {
        return 100;
    }

    @Override
    public String getDescription() {
        return "Margrita Pizza";
    }
}
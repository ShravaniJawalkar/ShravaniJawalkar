public class FarmhousePizza implements BasePizza {

    @Override
    public int cost(){
        return 250;
    }

    @Override
    public String getDescription() {
        return "Farmhouse Pizza";
    }
}
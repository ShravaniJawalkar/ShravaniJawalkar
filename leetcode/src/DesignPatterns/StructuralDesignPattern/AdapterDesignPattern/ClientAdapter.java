public class ClientAdapter implements Client{

    private Adaptee adaptee;

    public ClientAdapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public double getWeightInKg(){
        return this.adaptee.getWeightInPound() * 0.45359237;
    }
}
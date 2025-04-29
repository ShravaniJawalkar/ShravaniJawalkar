public class AdapterDemo {
    public static void main(String[] args) {
        Client client = new ClientAdapter(new AdapteeImpl());
        System.out.println("Weight in Kg :"+ client.getWeightInKg());
    }
}
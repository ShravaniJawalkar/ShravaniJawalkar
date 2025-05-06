public class ShoppingCart {
    private PaymentProcessing payementProcessing;

    public ShoppingCart(PaymentProcessing payementProcessing) {
        this.payementProcessing = payementProcessing;
    }

    public void checkout(Double amount) {
        payementProcessing.pay(amount);
    }
}
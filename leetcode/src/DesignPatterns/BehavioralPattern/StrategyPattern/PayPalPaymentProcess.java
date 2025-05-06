public class PayPalPaymentProcess implements PaymentProcessing{

    private final String payPalId;

    public PayPalPaymentProcess(String payPalId) {
        this.payPalId = payPalId;
    }

    @Override
    public void pay(Double amount) {
        System.out.println("Processing payment of " + amount + " using PayPal with ID: " + payPalId);
    }
}
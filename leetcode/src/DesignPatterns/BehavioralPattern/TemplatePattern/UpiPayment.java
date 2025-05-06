public class UpiPayment extends PaymentProcess {
    @Override
    protected void deductAmount() {
        System.out.println("Deducting amount using UPI");
    }

    @Override
    protected void validatePaymentDetails() {
        System.out.println("Validating UPI payment details");
    }
}
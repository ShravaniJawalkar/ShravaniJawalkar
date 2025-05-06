public class CreditCardPayment extends PaymentProcess {

    @Override
    protected void validatePaymentDetails() {
        System.out.println("Validating credit card details...");
        // Add credit card validation logic here
    }

    @Override
    protected void deductAmount() {
        System.out.println("Deducting amount from credit card...");
        // Add credit card deduction logic here
    }
}
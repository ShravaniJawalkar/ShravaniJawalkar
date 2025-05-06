public class PayPalPayment extends PaymentProcess {

    @Override
    protected void validatePaymentDetails() {
        System.out.println("Validating PayPal payment details...");
        // Add PayPal-specific validation logic here
    }

    @Override
    protected void deductAmount() {
        System.out.println("Deducting amount from PayPal account...");
        // Add PayPal-specific deduction logic here
    }
}
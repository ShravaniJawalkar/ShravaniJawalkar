public abstract class PaymentProcess {

    public void processPayment() {
        authenticateUser();
        validatePaymentDetails();
        deductAmount();
        sendConfirmation();
    }

    private void authenticateUser() {
        System.out.println("Authenticating user...");
    }

    protected abstract void validatePaymentDetails();

    protected abstract void deductAmount();

    private void sendConfirmation() {
        System.out.println("Sending payment confirmation...");
    }
}
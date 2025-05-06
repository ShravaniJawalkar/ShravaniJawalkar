public class TemplateDemo {
    public static void main(String[] args){
        PaymentProcess paymentProcess = new CreditCardPayment();
        paymentProcess.processPayment();
        paymentProcess = new PayPalPayment();
        paymentProcess.processPayment();
        paymentProcess = new UpiPayment();
        paymentProcess.processPayment();
    }
}
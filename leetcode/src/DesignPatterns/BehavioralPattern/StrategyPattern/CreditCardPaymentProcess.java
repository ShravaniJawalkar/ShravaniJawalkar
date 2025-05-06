public class CreditCardPaymentProcess implements PaymentProcessing{
    private final String creditCardNumber;
    private final String creditCardExpiryDate;
    private final String creditCardCVV;

    public CreditCardPaymentProcess(String creditCardNumber, String creditCardExpiryDate, String creditCardCVV) {
        this.creditCardNumber = creditCardNumber;
        this.creditCardExpiryDate = creditCardExpiryDate;
        this.creditCardCVV = creditCardCVV;
    }

    @Override
    public void pay(Double amount){
        System.out.println("Processing credit card payment of " + amount + " using card details " + creditCardNumber +" " + creditCardExpiryDate + " " + creditCardCVV);
    }
}
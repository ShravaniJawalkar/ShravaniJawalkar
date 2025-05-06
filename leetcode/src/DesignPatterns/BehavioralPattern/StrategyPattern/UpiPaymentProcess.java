public  class UpiPaymentProcess implements PaymentProcessing{
    private final String upiId;

    public UpiPaymentProcess(String upiId) {
        this.upiId = upiId;
    }

    @Override
    public void pay(Double amount){
        System.out.println("UPI Payment of " + amount + " using UPI ID: " + upiId);
    }
}
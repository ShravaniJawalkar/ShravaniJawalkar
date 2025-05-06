public class StrategyDemo {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart(new CreditCardPaymentProcess("1234567890123456", "12/23", "123"));
        cart.checkout(100.0);
        cart = new ShoppingCart(new PayPalPaymentProcess("user123@gmail.com"));
        cart.checkout(200.0);
        cart = new ShoppingCart(new UpiPaymentProcess("user@upi"));
        cart.checkout(300.0);
    }
}
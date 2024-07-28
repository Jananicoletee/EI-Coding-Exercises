
public class Main {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        cart.setPaymentStrategy(new CreditCardPayment("1234567890123456"));
        cart.checkout(100);

        cart.setPaymentStrategy(new PayPalPayment("user@example.com"));
        cart.checkout(200);

        cart.setPaymentStrategy(new BankTransferPayment("9876543210"));
        cart.checkout(300);
    }
}

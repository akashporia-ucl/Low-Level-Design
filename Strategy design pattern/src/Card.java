public class Card implements PaymentStrategy {
    @Override
    public void processPayment() {
        System.out.println("Payment via card");
    }
}

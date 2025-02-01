public class UPI implements PaymentStrategy {
    @Override
    public void processPayment() {
        System.out.println("Payment via UPI");
    }
}

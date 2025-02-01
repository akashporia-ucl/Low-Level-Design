public class Payment {
    public void processPayment(String paymentMode) {
        if (paymentMode.equals("UPI")) {
            System.out.println("Payment using UPI");
        }
        if (paymentMode.equals("Card")) {
            System.out.println("Payment using Card");
        }

    }
}

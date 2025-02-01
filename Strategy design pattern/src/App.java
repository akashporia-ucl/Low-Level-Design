public class App {
    public static void main(String[] args) throws Exception {
        Payment payment = new Payment();
        payment.processPayment("UPI");
        payment.processPayment("Card");

        System.out.println("\n-----Now using strategy design pattern-----\n");

        PaymentStrategy card = new Card();
        PaymentStrategy upi = new UPI();
        PaymentService paymentService1 = new PaymentService(upi);
        PaymentService paymentService2 = new PaymentService(card);

        paymentService1.makePayment();
        paymentService2.makePayment();
    }
}

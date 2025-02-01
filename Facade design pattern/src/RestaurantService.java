public class RestaurantService {
    private OrderProcessing orderProcessing;
    private PaymentProcessing paymentProcessing;
    private DeliveryProcessing deliveryProcessing;

    public RestaurantService(OrderProcessing orderProcessing, PaymentProcessing paymentProcessing,
            DeliveryProcessing deliveryProcessing) {
        this.orderProcessing = orderProcessing;
        this.paymentProcessing = paymentProcessing;
        this.deliveryProcessing = deliveryProcessing;
    }

    public void order(String item) {
        orderProcessing.placeOrder(item);
        paymentProcessing.makePayment(Math.random() * 100);
        deliveryProcessing.startDelivery();
    }

    public void status() {
        deliveryProcessing.endDelivery();
    }

}

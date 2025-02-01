public class App {
    public static void main(String[] args) throws Exception {
        RestaurantService restaurantService = new RestaurantService(new OrderProcessing(), new PaymentProcessing(),
                new DeliveryProcessing());

        restaurantService.order("Chicken momos");
        restaurantService.status();
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        CarFactory carFactory = new CarFactory();
        BusFactory busFactory = new BusFactory();
        VehicleInterface car1 = carFactory.create();
        VehicleInterface bus1 = busFactory.create();
        car1.drive();
        bus1.drive();
    }
}

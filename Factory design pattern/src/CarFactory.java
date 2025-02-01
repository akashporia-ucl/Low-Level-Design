public class CarFactory implements FactoryInterface {
    @Override
    public VehicleInterface create() {
        return new Car();
    }
}

public class BusFactory implements FactoryInterface {
    @Override
    public VehicleInterface create() {
        return new Bus();
    }
}

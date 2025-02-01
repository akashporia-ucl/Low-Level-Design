public class Car implements VehicleInterface {

    public Car() {
        System.out.println("Car built");
    }

    @Override
    public void drive() {
        System.out.println("Drive a car");
    }
}

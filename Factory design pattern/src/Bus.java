public class Bus implements VehicleInterface {

    public Bus() {
        System.out.println("Bus built");
    }

    @Override
    public void drive() {
        System.out.println("Drive a bus");
    }
}

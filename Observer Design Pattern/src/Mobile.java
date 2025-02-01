public class Mobile implements Observer {
    private Weather weather;
    private Integer mobileNumber;

    public Mobile(Weather weather, Integer mobileNumber) {
        this.weather = weather;
        this.mobileNumber = mobileNumber;
        System.out.println(this.mobileNumber + " subscribed");
    }

    @Override
    public void update() {
        System.out.println("Mobile - Temperature is: " + weather.getTemperature());
    }
}

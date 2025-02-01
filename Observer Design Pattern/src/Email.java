public class Email implements Observer {
    private Weather weather;
    private String email;

    public Email(Weather weather, String email) {
        this.weather = weather;
        this.email = email;
        weather.attach(this);
        System.out.println(this.email + " subscribed");
    }

    @Override
    public void update() {
        System.out.println("Email - Temperature is: " + weather.getTemperature());
    }

}

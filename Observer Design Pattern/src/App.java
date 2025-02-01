public class App {
    public static void main(String[] args) throws Exception {
        Weather weather = new Weather();
        Mobile mobile = new Mobile(weather, 123);
        Email email = new Email(weather, "abc@gmail.com");
        weather.attach(mobile);
        /*
         * It is better to attach an observer in the constructor itself.
         * Otherwise you will have to manually attach it
         */

        weather.setTemperature(43);
        System.out.println("Weather updated");
        weather.setTemperature(10);
        System.out.println("Email unsubscribed");
        weather.detach(email);
        weather.setTemperature(48);
        System.out.println("Weather updated");
    }
}

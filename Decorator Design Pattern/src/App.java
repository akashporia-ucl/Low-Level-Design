public class App {
    public static void main(String[] args) throws Exception {
        Pizza pizza = new Pepperoni(new Mozzarella(new PlainPizza()));
        System.out.println(pizza.getDescription());
        System.out.println(pizza.getCost());
    }
}

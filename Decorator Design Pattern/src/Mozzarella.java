public class Mozzarella extends PizzaDecorator {

    Mozzarella(Pizza pizza) {
        super(pizza);
    }

    public String getDescription() {
        return pizza.getDescription() + ",Mozzarella";
    }

    public Double getCost() {
        return pizza.getCost() + 2.15;
    }

}

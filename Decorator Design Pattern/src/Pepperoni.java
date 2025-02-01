public class Pepperoni extends PizzaDecorator {

    Pepperoni(Pizza pizza) {
        super(pizza);
    }

    public String getDescription() {
        return pizza.getDescription() + ",Pepperoni";
    }

    public Double getCost() {
        return pizza.getCost() + 3.75;
    }

}
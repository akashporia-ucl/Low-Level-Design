public abstract class PizzaDecorator implements Pizza {

    protected Pizza pizza;
    // Don't provide plain pizza

    PizzaDecorator(Pizza pizza) {
        this.pizza = pizza;
    }

    public String getDescription() {
        return pizza.getDescription();
    }

    public Double getCost() {
        return pizza.getCost();
    }

}

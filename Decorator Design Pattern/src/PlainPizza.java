public class PlainPizza implements Pizza {

    @Override
    public String getDescription() {
        return "Plain pizza";

    }

    @Override
    public Double getCost() {
        return 10.00;
    }

}

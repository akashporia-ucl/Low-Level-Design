import java.util.ArrayList;
import java.util.List;

public class Weather implements Subject {
    private Integer temperature;
    private List<Observer> users = new ArrayList<>();

    @Override
    public void attach(Observer o) {
        users.add(o);
    }

    @Override
    public void detach(Observer o) {
        users.remove(o);
    }

    @Override
    public void notifyAllObservers() {
        for (Observer o : users) {
            o.update();
        }
    }

    public void setTemperature(Integer temperature) {
        this.temperature = temperature;
        notifyAllObservers();
    }

    public float getTemperature() {
        return this.temperature;
    }
}

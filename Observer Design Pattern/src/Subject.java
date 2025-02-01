public interface Subject {
    public void notifyAllObservers();

    public void attach(Observer o);

    public void detach(Observer o);
}

package design_patterns.observer;

public interface Subject {
    /**
     * This interface allows for the observers to register to the subject, the observers to be removed, and the observers to be notified of any changes to the subject.
     */
    public void registerObserver(Observer observer);
    public void removeObserver(Observer observer);
    public void notifyObservers(Book book);
}

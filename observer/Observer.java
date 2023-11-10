package design_patterns.observer;

public interface Observer {
    /**
     * This is the observer interface. The customer and the store class implement this interace, and must include these two methods in order to run.
     */
    public void update(Book book);
    public void display();
}

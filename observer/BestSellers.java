package design_patterns.observer;
import java.util.*;
public class BestSellers implements Subject {
    private ArrayList<Observer> observers;
    private ArrayList<Book> bestSellers;
    /**
     * the BestSellers class initializes the array list of observers and best sellers, so the program knows who and how many oobservers there are, and what the best selling books are.
     */
    public BestSellers() {
        this.observers = new ArrayList<Observer>();
        this.bestSellers = new ArrayList<Book>();
    }
    /**
     * This method registers the observers, adding them to the array list.
     * @param observer the observer to be added to the array list
     */
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }
    /**
     * This method removes the observer from the array list.
     * @param observer the observer to be removed from the array list
     */
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }
    /**
     * This method loops through the observers and notifies them of a new best selling book.
     * @param book the book that the observers will be notified of
     */
    public void notifyObservers(Book book) {
        for(Observer observer : observers) {
            observer.update(book);
        }
    }
    /**
     * This method adds a book to the array list and notifes the observers of it.
     * @param book the book being added to the list
     */
    public void addBook(Book book) {
        bestSellers.add(book);
        notifyObservers(book);
    }
}

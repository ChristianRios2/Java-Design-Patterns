package design_patterns.observer;
import java.util.*;
public class Customer implements Observer {
    private Subject subject;
    private String firstName;
    private String lastName;
    private ArrayList<Book> wishList;
    /**
     * This method initializes the subject, first name, last name, and the wish list. It also registers the customer as an observer.
     */
    public Customer(Subject subject, String firstName, String lastName) {
        this.subject = subject;
        this.firstName = firstName;
        this.lastName = lastName;
        this.wishList = new ArrayList<Book>();
        subject.registerObserver(this);
    }
    /**
     * This method adds a book to the customer's wish list.
     */
    public void update(Book book) {
        wishList.add(book);
        //display();
    }
    /**
     * This method implements a for loop and prints to the terminal all the books in the customer's wish list.
     */
    public void display() {
        System.out.println("\nWish List:");
        for(int i=0; i < wishList.size(); i++) {
            System.out.println(wishList.get(i));
        }
    }
}

package design_patterns.observer;

import java.util.*;
public class Store implements Observer {
    private Subject subject;
    private String title;
    private Queue<Book> bestSellers;
    /**
     * This method initializes the subject and the queue of books as a linked list. It also registers the store as an observer.
     */
    public Store(Subject subject) {
        this.subject = subject;
        this.bestSellers = new LinkedList<Book>();
        subject.registerObserver(this);
    }
    /**
     * This method adds a book to the queue of books. If there are more than 5 books in the queue, the first book will be removed from the list. 
     * In order for this to work, bestSellers had to be declared as a linked list.
     */
    public void update(Book book) {
        bestSellers.add(book);
        if(bestSellers.size() > 5) {
            ((LinkedList<Book>) bestSellers).removeFirst();
        }
    }
    /**
     * This method implements a for loop that loops through the list of best sellers and prints the string version of each book to the terminal.
     */
    public void display() {
        System.out.println("Top 5 best sellers:");
        for(Book b : bestSellers) {
            System.out.println(b.toString());
        }
    }
}

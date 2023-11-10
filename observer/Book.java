package design_patterns.observer;

public class Book {
    private String title;
    private String authorFirstName;
    private String authorLastName;
    /**
     * This method initializes the title and author's name to be used.
     * @param title 
     * @param authorFirstName
     * @param authorLastName
     */
    public Book(String title, String authorFirstName, String authorLastName) {
        this.title = title;
        this.authorFirstName = authorFirstName;
        this.authorLastName = authorLastName;
    }
    /**
     * this method grabs the title from this class to use elsewhere.
     * @return the title of a book
     */
    public String getTitle() {
        return this.title;
    }
    /**
     * this method grabs the author's first name from this class to use elsewhere.
     * @return the author's first name
     */
    public String getAuthorFirstName() {
        return this.authorFirstName;
    }
    /**
     * this method grabs the author's last name from this class to use elsewhere.
     * @return the author's last name
     */
    public String getAuthorLastName() {
        return this.authorLastName;
    }
    /**
     * This method is used to format the output. It takes the title, first name, and last name, and turns it into a string.
     */
    public String toString() {
        String toastring = "- " + this.title + " by: " + this.authorFirstName + " " + this.authorLastName;
        return toastring;
    }
}

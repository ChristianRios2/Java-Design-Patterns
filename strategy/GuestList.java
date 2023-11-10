package design_patterns.strategy;
import java.util.*;
public class GuestList {
    private String title;
    private ArrayList<String> people = new ArrayList<String>(0);
    private SearchBehavior searchBehavior;

    /**
     * The GuestList method will show the name of the guest list when outputted to the terminal
     * @param title The name of the guest list
     */
    public GuestList(String title) {
        this.title = title;
    }
    /**
     * The add method looks at the linear search class, and if the person is already on the list, they will not be added again. If they are not on the list, they will be added.
     * @param person the name of the guest added to the list
     * @return
     */
    public boolean add(String person) {
        
        if(LinearSearch.contains(this.people, person)) {
           return false; 
        }
        
        people.add(person);
        return true;
    }
    /**
     * The remove method removes the person put int he parameter. The person will not be removed if they are not on the list.
     * @param person the name of the guest removed from the list
     * @return
     */
    public boolean remove(String person) {
        if(LinearSearch.contains(this.people, person)) {
            people.remove(person);
            return true;
        }

        return false;
    }
    /**
     * The getTitle method simply gets the title of the guest list.
     * @return
     */
    public String getTitle() {
        return this.title;
    }
    /**
     * This method is incomplete, but the purpose would have been to change from a linear search to a binary search when prompted by the driver.
     * @param searchBehavior
     */
    public void setSearchBehavior(SearchBehavior searchBehavior) {
        //this.searchBehavior = LinearSearch();
    }
    /**
     * This method returns the list of names to allow the driver to use it.
     * @return
     */
    public ArrayList<String> getList() {
        return this.people;
    }
}

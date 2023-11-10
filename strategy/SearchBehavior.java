package design_patterns.strategy;
import java.util.*;
public interface SearchBehavior {
    /**
     * This interface is what allows the program to find out if the guest list contains a name already on it that would be added. 
     * @param data 
     * @param item
     * @return
     */
    public static boolean contains(ArrayList<String> data, String item) {
        return false;
    }
}

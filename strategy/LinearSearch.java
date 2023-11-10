package design_patterns.strategy;
import java.util.*;
public class LinearSearch implements SearchBehavior {
    /**
     * This is the only search function I could make work. Using a for loop, each item in the array would be compared to the inputted string and if they match, the method would return true. If not, the method would return false.
     * @param data the array list of names
     * @param item the inputted name to compare to the list
     * @return
     */
    public static boolean contains(ArrayList<String> data, String item) {
        for(int i=0;i<data.size();i++){    
            String compare = data.get(i);
            if(compare.equalsIgnoreCase(item)){    
                return true;    
            }
        }
        return false;
        
    }

}

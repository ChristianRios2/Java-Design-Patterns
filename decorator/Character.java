package design_patterns.decorator;
import java.util.*;
/**
 * @author Christian Rios
 */
public abstract class Character {
    protected ArrayList<String> sections;
    /**
<<<<<<< HEAD

     * The Character constructor initializes the array list of sections for the potato head.
=======
     * The character constructor initializes the array list of sections for the potato head.
>>>>>>> be22ab88ceab339921fbbdc4c67e7a102987c971
     */
    public Character() {
        this.sections = new ArrayList<String>();
    }
    /**
<<<<<<< HEAD
     * The draw() method loops through the strings of sections and converts each section into a string and prints to the terminal.
=======
     * The draw() method loops through the array of sections and converts each section into a string and prints to the terminal.
>>>>>>> be22ab88ceab339921fbbdc4c67e7a102987c971
     */
    public void draw() {
        for(String b : sections) {
            System.out.println(b.toString());

        }
    }
}

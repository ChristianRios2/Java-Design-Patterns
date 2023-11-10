package design_patterns.decorator;
/**
 * @author Christian Rios
 */
public class Nose extends CharacterDecorator {
    /**
<<<<<<< HEAD
     * This constructor simply calls super in order to access parent (character decorator) objects, like sections.
     * @param character The kind of potato head, utilized by the driver
=======
     * The constructor calls super to access the objects the parent has.
     * @param character the type of potato head that wants to add a nose
>>>>>>> be22ab88ceab339921fbbdc4c67e7a102987c971
     */
    public Nose(Character character) {
        super(character);
    }
    /**
<<<<<<< HEAD
     * This customize method alters the fifth line (4th index) of the potato head to include a greater than symbol, resembling a nose. 
=======
     * This customize method changes the fourth index to add a greater than symbol, resembling a nose.
>>>>>>> be22ab88ceab339921fbbdc4c67e7a102987c971
     */
    public void customize() {
        sections.set(4,"|   >    | ");
    }
}

package design_patterns.decorator;
/**
 * @author Christian Rios
 */
public class Eyes extends CharacterDecorator {
    /**
<<<<<<< HEAD
     * This constructor simply calls super in order to access parent (character decorator) objects, like sections.
     * @param character The kind of potato head, utilized by the driver
=======
     * The constructor calls super to access the objects the parent has.
     * @param character the type of potato head that wants to add eyes
>>>>>>> be22ab88ceab339921fbbdc4c67e7a102987c971
     */
    public Eyes(Character character) {
        super(character);
    }
    /**
<<<<<<< HEAD
     * The customize method changes the fourth line (3rd index) of the potato head from a blank section to one with two o's for eyes.
=======
     * The customize method changes the 3rd index of the potato head to add two o's for eyes.
>>>>>>> be22ab88ceab339921fbbdc4c67e7a102987c971
     */
    public void customize() {
        sections.set(3, "|  o  o  | ");
    }
}

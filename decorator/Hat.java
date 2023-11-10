package design_patterns.decorator;
/**
 * @author Christian Rios
 */
public class Hat extends CharacterDecorator {
    /**
<<<<<<< HEAD
     * This constructor simply calls super in order to access parent (character decorator) objects, like sections.
     * @param character The kind of potato head, utilized by the driver
=======
     * The constructor calls super to access the objects the parent has.
     * @param character the type of potato head that wants to add a hat
>>>>>>> be22ab88ceab339921fbbdc4c67e7a102987c971
     */
    public Hat(Character character) {
        super(character);
    }
    /**
<<<<<<< HEAD
     * This customize method changes the top two sections of the potato head to resemble a hat.
=======
     * This customize method changes the top two lines of the potato head to implement a hat.
>>>>>>> be22ab88ceab339921fbbdc4c67e7a102987c971
     */
    public void customize() {
        sections.set(0,"   ____");
        sections.set(1,"__|____|____");
    }
}

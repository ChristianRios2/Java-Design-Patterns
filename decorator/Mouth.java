package design_patterns.decorator;
/**
 * @author Christian Rios
 */
public class Mouth extends CharacterDecorator{
    /**
<<<<<<< HEAD
     * This constructor simply calls super in order to access parent (character decorator) objects, like sections.
     * @param character The kind of potato head, utilized by the driver
=======
     * The constructor calls super to access the objects the parent has.
     * @param character the type of potato head that wants to add a mouth
>>>>>>> be22ab88ceab339921fbbdc4c67e7a102987c971
     */
    public Mouth(Character character) {
        super(character);
    }
    /**
<<<<<<< HEAD
     * This customize method alters the sixth line (5th index) of the potato head to include four dashes, resembling a mouth.
=======
     * This customize method changes the 5th index of the potato head to add four dashes, resembling a mouth.
>>>>>>> be22ab88ceab339921fbbdc4c67e7a102987c971
     */
    public void customize() {
        sections.set(5, " \\ ---- / ");
    }
}

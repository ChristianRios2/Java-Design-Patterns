package design_patterns.decorator;
/**
 * @author Christian Rios
 */
public abstract class CharacterDecorator extends Character {
    protected Character character;
    /**
<<<<<<< HEAD
     * The construcor intitializes the character (potato head, eye potato head, etc.) and loops through the sections of the character, adding them to the sections of this class.
     * Then, customize is called, and depending on what kind of potato head it is, will add certain "pieces" to the potato. 
     * @param character The kind of potato head, utilized by the driver
=======
     * The CharacterDecorator constrctor initializes character, and implements a for loop. 
     * This loop goes through the array of sections for character and adds them to the array of this class, effectively cloning the array list.
     * Finally, customize is called, changing the potato head to add whatever piece is called in from character.
>>>>>>> be22ab88ceab339921fbbdc4c67e7a102987c971
     */
    public CharacterDecorator(Character character) {
        this.character = character;
        for(String b : character.sections) {
            this.sections.add(b);
        
        }
        customize();
    }
    /**
<<<<<<< HEAD
     * This abstract method is defined by the children.
=======
     * The customize method is defined in the children. It will change a section of the potato head to add a part of the face that the child is.
>>>>>>> be22ab88ceab339921fbbdc4c67e7a102987c971
     */
    public abstract void customize();
}

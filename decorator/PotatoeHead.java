package design_patterns.decorator;
/**
 * @author Christian Rios
 */
public class PotatoeHead extends Character {
    /**
<<<<<<< HEAD
     * This constructor accesses the sections array in Character and modifies it to create the potato head. Each line of the potato head is an index in the section array list.
     * Underscores, slashes, and lines are used to create the potato shape.
=======
     * The potato head constructor adds 7 lines to the array list. Underscores, slashes, and lines are used to create the shape of a blank potato head.
>>>>>>> be22ab88ceab339921fbbdc4c67e7a102987c971
     */
    public PotatoeHead() {
        sections.add(0," ");
        sections.add(1,"   ____     ");
        sections.add(2," /      \\ ");
        sections.add(3,"|        | ");
        sections.add(4,"|        | ");
        sections.add(5," \\      / ");
        sections.add(6,"  \\____/ ");

    }
}

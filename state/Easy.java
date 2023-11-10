/**
 * @author Christian Rios
 */
import java.util.Random;
public class Easy implements State{
    private ArithmeticGame game;
    /**
     * The constructor intializes the ArithmeticGame object.
     * @param game
     */
    public Easy(ArithmeticGame game) {
        this.game = game;
    }
    /**
     * This class chooses a number between 1 and 10 and returns it.
     */
    public int getNum() {
        Random rand = new Random();
        int number = rand.nextInt(10);
        number+=1;
        return number;
    }
    /**
     * This class chooses a number between 0 and 1, and depending on the number, will return a different operation.
     */
    public String getOperation() {
        Random rand = new Random();
        int operation = rand.nextInt(2);
        if(operation == 0) {
            return "+";
        }
        return "-";
    }
    /**
     * levelUp brings the game state to medium mode.
     */
    public void levelUp() {
        System.out.println("You've been advanced to medium mode.");
        game.setState(game.getMediumState());
    }
    /**
     * levelDown just prints a message tot he player, as they are already on easy.
     */
    public void levelDown() {
        System.out.println("You seem to be struggling, you may want to study.");
    }
}

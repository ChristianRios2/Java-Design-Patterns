/**
 * @author Christian Rios
 */
import java.util.Random;
public class Hard implements State{
    private ArithmeticGame game;
    /**
     * The constructor intializes the ArithmeticGame object.
     */
    public Hard(ArithmeticGame game) {
        this.game = game;
    }
    /**
     * This class chooses a number between 1 and 100 and returns it.
     */
    public int getNum() {
        Random rand = new Random();
        int number = rand.nextInt(100);
        number+=1;
        return number;
    }
    /**
     * This class chooses a number between 0 and 3, and depending on the number, will return a different operation.
     */
    public String getOperation() {
        Random rand = new Random();
        int operation = rand.nextInt(4);
        if(operation == 0) {
            return "+";
        }
        else if(operation == 1) {
            return "-";
        }
        else if(operation == 2) {
            return "*";
        }
        return "/";
    }
    /**
     * levelUp prints a message to the player, as they are already on hard mode.
     */
    public void levelUp() {
        System.out.println("You are doing so well!!!");
    }
    /**
     * levelDown brings the game to medium mode.
     */
    public void levelDown() {
        System.out.println("You are struggling, let's go to medium mode.");
        game.setState(game.getMediumState());
    }
}

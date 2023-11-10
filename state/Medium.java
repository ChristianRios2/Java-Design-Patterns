/**
 * @author Christian Rios
 */
import java.util.Random;
public class Medium implements State{
    private ArithmeticGame game;
    /**
     * The constructor intializes the ArithmeticGame object.
     */
    public Medium(ArithmeticGame game) {
        this.game = game;
    }
    /**
     * This class chooses a number between 1 and 50 and returns it.
     */
    public int getNum() {
        Random rand = new Random();
        int number = rand.nextInt(50);
        number+=1;
        return number;
    }
    /**
     * This class chooses a number between 0 and 2, and depending on the number, will return a different operation.
     */
    public String getOperation() {
        Random rand = new Random();
        int operation = rand.nextInt(3);
        if(operation == 0) {
            return "+";
        }
        else if(operation == 1) {
            return "-";
        }
        return "*";
    }
    /**
     * levelUp brings the game up to hard mode.
     */
    public void levelUp() {
        System.out.println("You've been advanced to the hardest mode.");
        game.setState(game.getHardState());
    }
    /**
     * levelDown brings the game to easy mode.
     */
    public void levelDown() {
        System.out.println("You are struggling, let's go to easy mode.");
        game.setState(game.getEasyState());
    }
}

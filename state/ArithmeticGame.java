/**
 * @author Christian Rios
 */
import java.util.*;
public class ArithmeticGame {
    private State easyState;
    private State mediumState;
    private State hardState;
    private State state;
    private int score;
    private Scanner reader;
    /**
     * The constructor initializes the game states, sets the score to 0, starts the game on easy, and initializes the scanner.
     */
    public ArithmeticGame() {
        easyState = new Easy(this);
        mediumState = new Medium(this);
        hardState = new Hard(this);
        score = 0;
        state = easyState;
        reader = new Scanner(System.in);
    }
    /**
     * This method is the game. It find two numbers in the current game state and the operation, and finds an answer. 
     * It then asks the user to input an answer and if they are the same, it increments the score, and if they are not, subtracts the score by 1.
     * If the score is at or above 3, the game levels up and gets harder, and if the score is at or below -3, it levels down and gets easier.
     */
    public void pressQuestionButton() {
        int num1 = state.getNum();
        int num2 = state.getNum();
        String operation = state.getOperation();
        System.out.print(num1+" "+operation+" "+num2+": ");
        int answer = 0;
        if(operation.equals("+")) {
            answer = num1+num2;
        }
        else if(operation.equals("-")) {
            answer = num1-num2;
        }
        else if(operation.equals("*")) {
            answer = num1*num2;
        }
        else if(operation.equals("/")) {
            answer = num1/num2;
        }
        int userAnswer = reader.nextInt();
        if(answer == userAnswer) {
            System.out.println("Correct!");
            score++;
        }
        else if(answer != userAnswer) {
            System.out.println("Incorrect");
            score--;
        }
        if(score >= 3) {
            state.levelUp();
            score = 0;
        }
        else if(score <= -3) {
            state.levelDown();
            score = 0;
        }
    }
    /**
     * This method sets the state of the game.
     */
    public void setState(State state) {
        this.state = state;
    }
    /**
     * @return the easy state of the game
     */
    public State getEasyState() {
        return easyState;
    }
    /**
     * @return the medium state of the game
     */
    public State getMediumState() {
        return mediumState;
    }
    /**
     * @return the hard state of the game
     */
    public State getHardState() {
        return hardState;
    }
}

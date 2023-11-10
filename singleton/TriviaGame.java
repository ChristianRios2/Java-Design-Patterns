/**
 * @author Christian Rios
 */
import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;
public class TriviaGame {
    private static TriviaGame triviaGame;
    private int score;
    private Random rand;
    private Scanner reader;
    private ArrayList<Question> questions;
    /**
     * The private TriviaGame constructor initializes random and scanner and prints the welcome message. Finally,
     * it initialiazes the questions array list by going into DataLoader and grabbing the questions from questions.txt.
     */
    private TriviaGame() {
        rand = new Random();
        reader = new Scanner(System.in);
        System.out.println("Welcome to the trivia game!\n");
        questions = DataLoader.getTriviaQuestions();
    }
    /**
     * The getInstance method will create an instance of TriviaGame if there isn't one. Otherwise it will return the existing TriviaGame.
     */
    public static TriviaGame getInstance() {
        if (triviaGame == null) {
			triviaGame = new TriviaGame();
		}
		return triviaGame;
    }
    /**
     * The play method starts a round of the game, and after it is done, asks the player if they want to play or quit.
     * If they choose to play, it will play another round by calling playRound. 
     * If they choose to quit, then the program will display the score and exit.
     * If they do not choose p or q, it will give an error message and ask again.
     */
    public void play() {
        playRound();
        while(true) {
            System.out.print("(P)lay or (Q)uit: ");
            String decision = reader.next();
            if(decision.equalsIgnoreCase("P")) {
                System.out.println("\n");
                playRound();
            }
            else if(decision.equalsIgnoreCase("Q")) {
                System.out.println("\nYou won " + score + " games!\nGoodbye");
                System.exit(0);
            }
            else {
                System.out.println("Error: invalid input\n");
            }
        }
    }
    /**
     * The playRound method chooses a number from 0-9, and the number it chooses is the index of a question in the array list.
     * The question will then be printed out and will ask for an answer. If the answer is valid and correct, the score will go up by 1.
     * If the answer is valid and incorrect, it will show the correct answer.
     * If the answer is invalid, an error message will be displayed and will ask for a valid answer.
     */
    private boolean playRound() {
        int randquestion = rand.nextInt(10);
        Question newquestion = questions.get(randquestion);

        System.out.println(newquestion.toString());
        boolean noerror = true;
        while(noerror) {
            System.out.print("Enter answer: ");
            int answer = reader.nextInt();
            if(answer > 0 && answer < 5) {
                if(newquestion.isCorrect(answer)) {
                    System.out.println("Yay! You got it correct!");
                    score++;
                    return true;
                }
                System.out.println("You got it wrong!" + " The correct answer is: " + newquestion.getCorrectAnswer());
                return false;
            }
            System.out.println("Error: out of bounds");
        }
        return false;
    }
}

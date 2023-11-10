/**
 * @author Christian Rios
 */
public class Question {
    private String question;
    private String[] answers;
    private int correctAnswer;
    /**
     * The question constructor initializes question, correctAnswer, and the answers array.
     * Then, each answer is given an index in the array in order.
     */
    public Question(String question, String ans1, String ans2, String ans3, String ans4, int correctAnswer) {
        this.question = question;
        this.correctAnswer = correctAnswer;
        this.answers = new String[4];
        answers[0] = ans1;
        answers[1] = ans2;
        answers[2] = ans3;
        answers[3] = ans4;
    } 
    /**
     * toString correctly formats the question to look like the sample output.
     */
    public String toString() {
        String result = "";
        result += question + "\n";
        result += " 1. " + answers[0] + "\n";
        result += " 2. " + answers[1] + "\n";
        result += " 3. " + answers[2] + "\n";
        result += " 4. " + answers[3] + "\n";
        return result;
    }
    /**
     * isCorrect will check if the number the user gives is the same as the correctAnswer(+1, as correctAnswer is 0-based).
     * @param userAnswer the number the user gives as an answer
     * @return true if they are correct, false if they are incorrect
     */
    public boolean isCorrect(int userAnswer) {
        if(userAnswer == correctAnswer+1) {
            return true;
        }
        return false;
    }
    /**
     * getCorrectAnswer simply returns the correctAnswer as a string, to display if the user gets the question wrong.
     * @return
     */
    public String getCorrectAnswer() {
        return answers[correctAnswer];
    }
}

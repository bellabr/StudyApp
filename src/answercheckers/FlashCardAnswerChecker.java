package answercheckers;

public class FlashCardAnswerChecker implements AnswerChecker{

    /**
    All non-empty answer is valid
     */
    public boolean isValidAnswerForm(String inputAnswer) {
        return inputAnswer.length() >= 1;
    }

    public boolean isCorrectAnswer(String inputAnswer, String correctAnswer) {
        return inputAnswer.equalsIgnoreCase("y");
    }
}

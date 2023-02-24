package QuizOOP;

public class Question {
    private static int score = 0;
    private static int questionsAmount = 0;

    private final int NUMBER;
    private final String TEXT;
    private final Option[] OPTIONS;

    public Question(int number, String text, Option[] options) {
        this.NUMBER = number;
        this.TEXT = text;
        this.OPTIONS = options;

        questionsAmount++;
    }

    public void printQuestion() {
        System.out.println(NUMBER + ". " + TEXT);
        for (Option option : OPTIONS) {
            option.printOption();
        }
    }

    public boolean isAnswerCorrect(int answerNumber) {
        if (answerNumber >= 1 && answerNumber <= OPTIONS.length) {
            if (this.OPTIONS[answerNumber - 1].IS_CORRECT_OPTION) {
                score++;
                return true;
            }
        }
        return false;
    }

    public static String getResult() {
        return "Результат: " + score + " правильных ответов из " + questionsAmount;
    }
}
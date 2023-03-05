package Homework.QuizOOP;

public class Question {
    private final int NUMBER;
    private final String TEXT;
    private final Option[] OPTIONS;

    public Question(int number, String text, Option[] options) {
        this.NUMBER = number;
        this.TEXT = text;
        this.OPTIONS = options;
    }

    public void printQuestion() {
        System.out.println(NUMBER + ". " + TEXT);
        for (Option option : OPTIONS) {
            option.printOption();
        }
    }

    public boolean isAnswerCorrect(int answerNumber) {
        if (answerNumber >= 1 && answerNumber <= OPTIONS.length) {
            return this.OPTIONS[answerNumber - 1].IS_CORRECT_OPTION;
        }
        return false;
    }

}
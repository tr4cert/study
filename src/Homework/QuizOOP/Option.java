package Homework.QuizOOP;

public class Option {
    private final int NUMBER;
    private final String TEXT;
    public final boolean IS_CORRECT_OPTION;


    public Option(int number, String text, boolean isCorrectOption) {
        NUMBER = number;
        TEXT = text;
        IS_CORRECT_OPTION = isCorrectOption;
    }


    public void printOption() {
        System.out.println("\t" + NUMBER + ". " + TEXT);
    }
}

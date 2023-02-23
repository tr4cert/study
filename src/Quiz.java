import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        long time = System.currentTimeMillis();

        int counterCorrectAnswers = 0;
        String[] questions = getQuestions();
        String[][] answerOptions = getAnswerOptions();

        int[] answers = {0, 1, 2, 3};

        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            for (int j = 0; j < answerOptions[i].length; j++) {
                System.out.println((j+1) + ". " + answerOptions[i][j]);
            }
            Scanner scan = new Scanner(System.in);
            int number = scan.nextInt();

            if (number-1 == answers[i]) {
                counterCorrectAnswers++;
                System.out.println("Это правильный ответ");
            } else {
                System.out.println("Ответ неверный");
            }
        }

        System.out.println("Ваш результат: " + counterCorrectAnswers + " верных ответов из " + questions.length);

        System.out.println(System.currentTimeMillis()-time);
    }

    private static String[][] getAnswerOptions() {
        return new String[][]{
                {"Москва", "Санкт-Петербург", "Екатеринбург"},
                {"48", "50", "52", "55", "57"},
                {"3.5", "0.314", "3.14", "3.41"},
                {"врач", "музыкант", "политик", "ученый", "актер", "журналист"}
        };
    }

    private static String[] getQuestions() {
        return new String[]{"Назовите столицу России", "Сколько звезд на флаге США?", "Чему равно число П?", "Кто такой Ньютон?"};
    }

}

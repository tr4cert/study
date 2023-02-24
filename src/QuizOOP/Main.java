package QuizOOP;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Question[] questions = generateQuestions();
        startQuiz(questions);

    }

    private static void startQuiz(Question[] questions) {
        for (Question question : questions) {
            question.printQuestion();
            Scanner sc = new Scanner(System.in);
            try {
                int userAnswer = sc.nextInt();
                if (question.isAnswerCorrect(userAnswer)) System.out.println("Правильно");
                else System.out.println("Неправильно");
            } catch (Exception e) {
                System.out.println("На ввод подано некорректное значение");
            }
        }

        System.out.println(Question.getResult());

    }

    private static Question[] generateQuestions() {

        Question questionFirst = new Question(1, "Какая из этих премий впоследствии была переименована в Государственную премию СССР?", new Option[]{
                new Option(1, "Сталинская", true),
                new Option(2, "Ленинская", false),
                new Option(3, "Ломоносовская", false),
                new Option(4, "Нобелевская", false),
                new Option(5, "Дмитриевская", false)});


        Question questionSecond = new Question(2, "Какое из перечисленных государств возглавляет королева Великобритании?", new Option[]{
                new Option(1, "Коста-Рика", false),
                new Option(2, "Шри-Ланка", false),
                new Option(3, "Малазия", false),
                new Option(4, "Ямайка", true)});


        Question questionThird = new Question(3, "Какой вид березы славится красивой древесиной?", new Option[]{
                new Option(1, "Корейская", false),
                new Option(2, "Карельская", true),
                new Option(3, "Курильская", false)});


        Question questionFourth = new Question(4, "Что разрушали луддиты?", new Option[]{
                new Option(1, "Католические храмы", false),
                new Option(2, "Машины", true),
                new Option(3, "Античные статуи", false),
                new Option(4, "Школы", false)});


        return new Question[]{questionFirst, questionSecond, questionThird, questionFourth};
    }
}

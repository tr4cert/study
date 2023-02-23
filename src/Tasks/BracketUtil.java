/**
 * Дана строка, состоящая из скобок, а также открывающий и закрывающий символ скобок.
 * Необходимо реализовать метод, который проверяет что в строке у каждой открывающей скобки есть соответствующая ей закрывающая скобка.
 * Строка в которой закрывающая скобка идёт впереди открывающей является некорректной.
 * Например (()) - корректная строка, ()) - некорректная строка
 */

package Tasks;

public class BracketUtil {
    public static boolean isCorrectBrackets(String input, char bracketOpenSymbol, char bracketCloseSymbol) {
        int openBracketsCounter = 0;
        int closeBracketsCounter = 0;

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == bracketCloseSymbol && i == 0) return false;
            else {
                if (input.charAt(i) == bracketOpenSymbol) openBracketsCounter++;
                else if (input.charAt(i) == bracketCloseSymbol) closeBracketsCounter++;
            }
        }

        return openBracketsCounter == closeBracketsCounter;
    }

    public static void main(String[] args) {
        System.out.println("Ввод равного поличества открывающих и закрывающих скобок - "
                + BracketUtil.isCorrectBrackets("{{}}", '{', '}'));
        System.out.println("Ввод неравного поличества открывающих и закрывающих скобок - "
                + BracketUtil.isCorrectBrackets("{{}}}", '{', '}'));
    }
}

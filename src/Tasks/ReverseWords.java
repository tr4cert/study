/**
 * Дана строка, состоящая из слов, разделенных пробелами.
 * Необходимо реализовать метод, который возвращает строку, слова в которой записаны в обратном порядке.
 * Например, для строки "test abc" необходимо получить строку "abc test".
 */

package Tasks;

public class ReverseWords {
    public static String reverseWords(String inputText) {
        String[] stringAsArray = inputText.split(" ");
        String reverseString = "";
        for (int i = 0; i < stringAsArray.length; i++) {
            reverseString += stringAsArray[stringAsArray.length - i - 1];

            if (i != stringAsArray.length - 1) reverseString += " ";
        }
        return reverseString;
    }


    public static void main(String[] args) {
        System.out.println(reverseWords("два слова восемь букв "));
        System.out.println(reverseWords(""));
        System.out.println(reverseWords("word"));
        System.out.println(reverseWords("1 5 ha s z ddd"));
    }
}

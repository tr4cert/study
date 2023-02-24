/**
 * Реализовать метод, который возвращает шестнадцатеричное представление переданного числа.
 */

package Tasks;

public class HexConverter {
    public static StringBuilder convertNumToHex(int input) {
        StringBuilder result = new StringBuilder();

        while (input >= 16) {
            switch (input % 16) {
                case 10 -> result.append('A');
                case 11 -> result.append('B');
                case 12 -> result.append('C');
                case 13 -> result.append('D');
                case 14 -> result.append('E');
                case 15 -> result.append('F');
                default -> result.append(input % 16);
            }
            input = input / 16;
        }

        result.append(input).reverse();
        return result;


        // return new StringBuilder(Integer.toHexString(input).toUpperCase()) - реализация готовая

    }

    public static void main(String[] args) {
        System.out.println(convertNumToHex(38385));
    }
}

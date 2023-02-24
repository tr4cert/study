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

    public static StringBuilder convertHexToBinary(String input) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            switch (input.charAt(i)) {
                case '0' -> result.append("0000");
                case '1' -> result.append("0001");
                case '2' -> result.append("0010");
                case '3' -> result.append("0011");
                case '4' -> result.append("0100");
                case '5' -> result.append("0101");
                case '6' -> result.append("0110");
                case '7' -> result.append("0111");
                case '8' -> result.append("1000");
                case '9' -> result.append("1001");
                case 'A' -> result.append("1010");
                case 'B' -> result.append("1011");
                case 'C' -> result.append("1100");
                case 'D' -> result.append("1101");
                case 'E' -> result.append("1110");
                case 'F' -> result.append("1111");
                default -> {
                    return new StringBuilder("Unknown");
                }
            }
        }

        removeLeadingZeroes(result); // Можно было через регекс сделать, но будет выглядеть сложно

        return result;
    }

    private static void removeLeadingZeroes(StringBuilder result) {
        for (int i = 0; i < result.length(); i++) {
            if (result.charAt(i) == '0') {
                result.deleteCharAt(i);
                i--;
            }
            else break;

        }
    }



    public static void main(String[] args) {
        System.out.println(convertNumToHex(124));
        System.out.println(convertHexToBinary("AB"));
    }
}

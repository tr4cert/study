/**
 * Реализовать метод, который заменяет все нулевые биты переданного числа на 1 и возвращает получившееся десятиричное число.
 */

package Tasks;

public class UtilShiftZeroes {
    public static int shiftZeroes(int input) {
        String binaryStringZeroesReplaced = Integer.toBinaryString(input).replace('0', '1');

        return binaryToDecimal(binaryStringZeroesReplaced);
    }

    private static int binaryToDecimal(String binaryString) {
        int result = 0;
        int stringLength = binaryString.length();

        for (int i = 0; i < binaryString.length(); i++) {
            char number = binaryString.charAt(stringLength - i - 1);
            result += (Math.pow(2, i) * Integer.parseInt(String.valueOf(number)));
        }
        return result;
    }




    public static void main(String[] args) {
        System.out.println("При вводе числа 3435, метод должен вернуть 4095 - '" + shiftZeroes(3435) + "'");
    }
}

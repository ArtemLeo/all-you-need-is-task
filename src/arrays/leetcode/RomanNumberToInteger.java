package arrays.leetcode;

/*
  # Roman number to Integer:
  Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.

  For example, 2 is written as II in Roman numeral, just two ones added together.
  The number 27 is written as XXVII, which is XX + V + II.

  Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII.
  Instead, the number four is written as IV. Because the one is before the five we subtract it making four.
  There are six instances where subtraction is used:
   - I can be placed before V (5) and X (10) to make 4 and 9.
   - X can be placed before L (50) and C (100) to make 40 and 90.
   - C can be placed before D (500) and M (1000) to make 400 and 900.

  Given a roman numeral, convert it to an integer.
  Example 1:
    Input: s = "III"
    Output: 3
    Explanation: III = 3.
  Example 2:
    Input: s = "LVIII"
    Output: 58
    Explanation: L = 50, V= 5, III = 3.
  Example 3:
    Input: s = "MCMXCIV"
    Output: 1994
    Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.
 */

public class RomanNumberToInteger {
    public static void main(String[] args) {
        String original = "III";
        int result = fromRomanToInteger(original);
        System.out.println(result);
    }

    private static int fromRomanToInteger(String original) {
        // Объявление переменных result (результат) и number (текущая цифра, соответствующая римской цифре)
        int result = 0, number = 0;
        // Цикл, проходящий по строке original в обратном порядке
        for (int i = original.length() - 1; i >= 0; i--) {
            // Определение числового значения текущей римской цифры
            switch (original.charAt(i)) {
                case 'I' -> number = 1;
                case 'V' -> number = 5;
                case 'X' -> number = 10;
                case 'L' -> number = 50;
                case 'C' -> number = 100;
                case 'D' -> number = 500;
                case 'M' -> number = 1000;
            }
            // Проверка условия, чтобы корректно вычислить значение результата
            if (4 * number < result) {
                result -= number;  // Если текущая цифра меньше 4 раз значения предыдущей, то вычитаем текущее значение
            } else {
                result += number;  // Иначе прибавляем текущее значение к результату
            }
        }
        // Возвращаем итоговое числовое значение в римской системе
        return result;
    }
}

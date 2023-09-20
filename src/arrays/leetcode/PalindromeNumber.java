package arrays.leetcode;

/*
  Palindrome Number:
  Given an integer x, return true if x is a palindrome, and false otherwise.

  Example 1:
    Input: x = 121
    Output: true
    Explanation: 121 reads as 121 from left to right and from right to left.
  Example 2:
    Input: x = -121
    Output: false
    Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore, it is not a palindrome.
  Example 3:
    Input: x = 10
    Output: false
    Explanation: Reads 01 from right to left. Therefore, it is not a palindrome.
 */

public class PalindromeNumber {
    public static void main(String[] args) {
        int number = 121;
        boolean resultWithString = trueFalsePalindromeWithString(number);
        System.out.println(resultWithString);
        boolean resultWithWhile = trueFalsePalindromeWithWhile(number);
        System.out.println(resultWithWhile);

    }

    private static boolean trueFalsePalindromeWithString(int number) {
        String original = String.valueOf(number);
        String reverse = new StringBuilder(original).reverse().toString();
        return original.equals(reverse);
    }

    private static boolean trueFalsePalindromeWithWhile(int number) {
        if (number < 0 || (number != 0 && number % 10 == 0)) {
            return false;
        }
        int reverse = 0;
        while (number > reverse) {
            reverse = reverse * 10 + number % 10;
            number = number / 10;
        }
        return (number == reverse || number == reverse / 10);
    }
}

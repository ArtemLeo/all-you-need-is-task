package string;
/*
 # 771. Jewels and Stones:

 You're given strings jewels representing the types of stones that are jewels,
 and stones representing the stones you have. Each character in stones is a type of stone you have.
 You want to know how many of the stones you have are also jewels.

 Letters are case-sensitive, so "a" is considered a different type of stone from "A".

 Example 1:
   Input: jewels = "aA", stones = "aAAbbbb"
   Output: 3

 Example 2:
   Input: jewels = "f", stones = "FF"
   Output: 0
 */

public class String_011_JewelsAndStones {
    public static void main(String[] args) {
        String jewels = "aA";
        String stones = "aAAbbbb";
        int withToCharArray = numJewelsInStonesWithToCharArray(jewels, stones);
        int withIndexOfAndCharAt = numJewelsInStones2WithIndexOfAndCharAt(jewels, stones);
        System.out.println("Matches found (withToCharArray) = " + withToCharArray);
        System.out.println("Matches found (withIndexOfAndCharAt) = " + withIndexOfAndCharAt);
    }

    private static int numJewelsInStones2WithIndexOfAndCharAt(String jewels, String stones) {
        int result = 0;
        for (int i = 0; i < stones.length(); i++) {
            if (jewels.indexOf(stones.charAt(i)) != -1) {
                result++;
            }
        }
        return result;
    }

    private static int numJewelsInStonesWithToCharArray(String jewels, String stones) {
        int result = 0;
        for (char ch : stones.toCharArray()) {
            if (jewels.indexOf(ch) != -1) {
                result++;
            }
        }
        return result;
    }
}

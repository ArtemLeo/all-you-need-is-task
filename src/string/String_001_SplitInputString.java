package string;

/*
  Create a program that displays the first and last name on the screen in different lines.
 */

public class String_001_SplitInputString {
    public static void main(String[] args) {
        String inputString = "Alexey Alekseev";
        System.out.println("Original: " + inputString);
        splitInputString(inputString);
    }

    private static void splitInputString(String inputString) {
        String[] words = inputString.split(" ");
        for (String word : words) {
            System.out.println(word);
        }
    }
}

package string;

/*
  Replace all sad emoji in a line with happy emoji;
 */

public class String_002_ReplaceCharacters {
    public static void main(String[] args) {
        String string = "emoji :)  emoji :(  emoji :(  emoji :)  emoji :(  emoji :(";
        String newString = replaceCharacters(string);
        System.out.println(newString);
    }

    private static String replaceCharacters(String string) {
        return string.replace(":(", ":)");
    }
}

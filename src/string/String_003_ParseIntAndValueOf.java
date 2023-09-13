package string;

public class String_003_ParseIntAndValueOf {
    public static void main(String[] args) {
        // parseInt = String -> int;
        String string1 = "10";
        String string2 = "5";
        int resultInt = sumStringNumbers(string1, string2);
        System.out.println("Result parse to int from Strings \"10\" and \"5\" = " + resultInt);

        // valueOf = int -> String -> take the first letter (0 index);
        int number = 12345;
        char firstLetter = fromIntToStringAndTakeFirstLetter(number);
        String resultString = String.valueOf(firstLetter);
        System.out.println("Result parse to String from int = " + resultString);
    }

    private static int sumStringNumbers(String string1, String string2) {
        return Integer.parseInt(string1) + Integer.parseInt(string2);
    }

    private static char fromIntToStringAndTakeFirstLetter(int number) {
        String stringValue = String.valueOf(number);
        return stringValue.charAt(0);
    }
}


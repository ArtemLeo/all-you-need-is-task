package string;

public class String_003_ParseIntAndValueOf {
    public static void main(String[] args) {
        // parseInt = String -> int;
        String string1 = "10";
        String string2 = "5";
        int resultInt = sumStringNumbers(string1, string2);
        System.out.println("Result parse to int from Strings \"10\" and \"5\" = " + resultInt);

        // valueOf = int -> String;
        int number = 12345;
        String resultString = fromIntToString(number);
        System.out.println("Result parse to String from int = " + resultString);

    }

    private static int sumStringNumbers(String string1, String string2) {
        return Integer.parseInt(string1) + Integer.parseInt(string2);
    }

    private static String fromIntToString(int number) {
        return String.valueOf(number);
    }
}


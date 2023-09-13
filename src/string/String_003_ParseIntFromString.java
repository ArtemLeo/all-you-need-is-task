package string;

public class String_003_ParseIntFromString {
    public static void main(String[] args) {
        String string1 = "10";
        String string2 = "5";
        int result = sumStringNumbers(string1, string2);
        System.out.println("Result parse to int from strings \"10\" and \"5\" = " + result);
    }

    private static int sumStringNumbers(String string1, String string2) {
        return Integer.parseInt(string1) + Integer.parseInt(string2);
    }
}


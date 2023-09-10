package elementary;

/*
  Convert the number 1110 from the binary system to decimal.

   0 * 2 ^ 0 = 0
   1 * 2 ^ 1 = 2
   1 * 2 ^ 2 = 4
   1 * 2 ^ 3 = 8
   -------------
   0 + 2 + 4 + 8 = 14
 */

public class Elementary_008_FromBinarySystemToDecimal {
    public static void main(String[] args) {
        String binaryNumber = "1110";
        int decimalNumber = 0;

        for (int i = binaryNumber.length() - 1, extent = 0; i >= 0; i--, extent++) {
            char digit = binaryNumber.charAt(i);
            int bitValue = Character.getNumericValue(digit);
            int bitWeight = (int) Math.pow(2, extent);
            decimalNumber += bitValue * bitWeight;
        }
        System.out.println("Decimal representation of the number 1110: " + decimalNumber);
    }
}

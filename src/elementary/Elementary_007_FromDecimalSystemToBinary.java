package elementary;

/*
  Convert the number 14 from decimal system to binary.

   14 / 2 = 7 (remainder % 0)
   7 / 2 = 3 (% 1)
   3 / 2 = 1 (% 1)
   1 / 2 = 0 (% 1)
   ---------------
   Write the results in reverse order: 1110.
 */

public class Elementary_007_FromDecimalSystemToBinary {
    public static void main(String[] args) {
        int decimalNumber = 14;
        StringBuilder binaryNumber = new StringBuilder();

        if (decimalNumber == 0) {
            binaryNumber = new StringBuilder("0");
        } else {
            while (decimalNumber > 0) {
                int remainder = decimalNumber % 2;
                binaryNumber.insert(0, remainder);
                decimalNumber /= 2;
            }
        }
        System.out.println("Binary representation of the number 14: " + binaryNumber);
    }
}

package elementary;

/*
  Create a program that displays the multiplication table;
 */

public class Elementary_005_MultiplicationTable {
    public static void main(String[] args) {
        int[][] doubleArray = new int[10][10];
        displayMultiplicationTable(doubleArray);
    }

    private static void displayMultiplicationTable(int[][] doubleArray) {
        for (int i = 1; i <= doubleArray.length; i++) {
            for (int j = 1; j <= doubleArray.length; j++) {
                doubleArray[i - 1][j - 1] = i * j;
                System.out.printf("%3d", doubleArray[i - 1][j - 1]);
                System.out.print("  ");
            }
            System.out.println();
        }
    }
}

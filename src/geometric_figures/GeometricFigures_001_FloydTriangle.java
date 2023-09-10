package geometric_figures;

/*
 Create a program that will print the numbers sequentially in the form of a triangle (floyd triangle).
 */

public class GeometricFigures_001_FloydTriangle {
    public static void main(String[] args) {
        int value = 10;
        displayFloydTriangle(value);
    }

    private static void displayFloydTriangle(int value) {
        int count = 1;
        for (int i = 0; i <= value; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(count + " ");
                count++;
            }
            System.out.println();
        }
    }
}

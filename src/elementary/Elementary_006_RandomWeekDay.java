package elementary;

/*
  Write a random number generator (from 1 to 7), output the day of the week corresponding to the number;
 */

import java.util.Random;

public class Elementary_006_RandomWeekDay {
    public static void main(String[] args) {
        displayRandomDayOfTheWeek();
    }

    private static void displayRandomDayOfTheWeek() {
        Random random = new Random();
        switch (random.nextInt(8) + 1) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("Incorrect input! Please repeat ...");
        }
    }
}

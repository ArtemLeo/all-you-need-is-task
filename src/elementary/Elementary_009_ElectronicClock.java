package elementary;

public class Elementary_009_ElectronicClock {
    public static void main(String[] args) {
        int hoursValue = 5;
        int minutesValue = 60;
        int secondsValue = 60;
        howMuchTime(hoursValue, minutesValue, secondsValue);
    }

    private static void howMuchTime(int hoursValue, int minutesValue, int secondsValue) {
        HOUR:
        for (int hour = 0; hour < hoursValue; hour++) {
            if (hour == 4) {
                break HOUR;
            }
            Minutes:
            for (int minutes = 0; minutes < minutesValue; minutes++) {
                if (minutes == 55) {
                    break;
                }
                if (minutes == 10 || minutes == 20) {
                    continue Minutes;
                }
                Second:
                for (int seconds = 0; seconds < secondsValue; seconds++) {
                    if (hour <= 9) {
                        System.out.print("0" + hour + " (hour) : ");
                    } else {
                        System.out.print(hour + " (hour) : ");
                    }
                    if (minutes <= 9) {
                        System.out.print("0" + minutes + " (minutes) : ");
                    } else {
                        System.out.print(minutes + " (minutes) : ");
                    }
                    if (seconds <= 9) {
                        System.out.println("0" + seconds + " (seconds)");
                    } else {
                        System.out.println(seconds + " (seconds)");
                    }
                }
            }
        }
    }
}


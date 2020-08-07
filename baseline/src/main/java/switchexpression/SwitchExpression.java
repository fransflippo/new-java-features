package switchexpression;

import java.time.DayOfWeek;

public class SwitchExpression {

    public String getDayOfWeekName(int dayOfWeekNumber) {
        switch (dayOfWeekNumber) {
            case 0:
                return "Sunday";
            case 1:
                return "Monday";
            case 2:
                return "Tuesday";
            case 3:
                return "Wednesday";
            case 4:
                return "Thursday";
            case 5:
                return "Friday";
            case 6:
                return "SATURDAY";
            default:
                throw new IllegalArgumentException("Invalid day of week number");
        }
    }

    public String getDayOfWeekName(DayOfWeek dayOfWeek) {
        switch (dayOfWeek) {
            case SUNDAY:
                return "Sunday";
            case MONDAY:
                return "Monday";
            case TUESDAY:
                return "Tuesday";
            case WEDNESDAY:
                return "Wednesday";
            case THURSDAY:
                return "Thursday";
            case FRIDAY:
                return "Friday";
            case SATURDAY:
                return "SATURDAY";
            default:
                throw new IllegalArgumentException("Invalid day of week number");
        }
    }

    public boolean isWeekend(int dayOfWeekNumber) {
        switch (dayOfWeekNumber) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                return false;
            case 0:
            case 6:
                return true;
            default:
                throw new IllegalArgumentException("Invalid day of week number");
        }
    }

    public void printIsWeekend(DayOfWeek dayOfWeek) {
        // Q: What's wrong with this code?
        switch (dayOfWeek) {
            case MONDAY:
            case TUESDAY:
            case WEDNESDAY:
            case THURSDAY:
            case FRIDAY:
                System.out.println(" is a weekday");
                break;
            case SATURDAY:
            case SUNDAY:
                System.out.println(" is a weekend day");
        };

    }
}

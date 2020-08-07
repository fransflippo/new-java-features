package switchexpression;

import java.time.DayOfWeek;

public class SwitchExpression {

    public String getDayOfWeekName(int dayOfWeekNumber) {
        return switch (dayOfWeekNumber) {
            case 0 -> "Sunday";
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            default -> throw new IllegalArgumentException("Invalid day of week number: " + dayOfWeekNumber);
        };
    }

    public String getDayOfWeekName(DayOfWeek dayOfWeek) {
        return switch (dayOfWeek) {
            case SUNDAY -> "Sunday";
            case MONDAY -> "Monday";
            case TUESDAY -> "Tuesday";
            case WEDNESDAY -> "Wednesday";
            case THURSDAY -> "Thursday";
            case FRIDAY -> "Friday";
            case SATURDAY -> "Saturday";
        };
    }

    public boolean isWeekend(int dayOfWeekNumber) {
        return switch (dayOfWeekNumber) {
            case 1, 2, 3, 4, 5 -> false;
            case 0, 6 -> true;
            default -> throw new IllegalArgumentException("Invalid day of week number: " + dayOfWeekNumber);
        };
    }

    public boolean isWeekend2(int dayOfWeekNumber) {
        return switch (dayOfWeekNumber) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                yield false;
            case 0:
            case 6:
                yield true;
            default:
                throw new IllegalArgumentException("Invalid day of week number: " + dayOfWeekNumber);
        };
    }

    public void printIsWeekend(DayOfWeek dayOfWeek) {
        switch (dayOfWeek) {
            case SUNDAY -> System.out.print("Sunday");
            case MONDAY -> System.out.print("Monday");
            case TUESDAY -> System.out.print("Tuesday");
            case WEDNESDAY -> System.out.print("Wednesday");
            case THURSDAY -> System.out.print("Thursday");
            case FRIDAY -> System.out.print("Friday");
            case SATURDAY -> System.out.print("Saturday");
        };
        switch (dayOfWeek) {
            case MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY -> System.out.println(" is a weekday");
            case SATURDAY, SUNDAY -> System.out.println(" is a weekend day");
        };
    }


}

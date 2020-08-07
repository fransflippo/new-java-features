package switchexpression;

import org.junit.jupiter.api.Test;

import java.time.DayOfWeek;

import static org.junit.jupiter.api.Assertions.*;

class SwitchExpressionTest {

    @Test
    void getDayOfWeekName() {
        System.out.println(new SwitchExpression().getDayOfWeekName(3));
    }

    @Test
    void getDayOfWeekName_invalidNumber() {
        assertThrows(IllegalArgumentException.class, () -> {
            System.out.println(new SwitchExpression().getDayOfWeekName(-1));
        });
    }

    @Test
    void getDayOfWeekName_enum() {
        System.out.println(new SwitchExpression().getDayOfWeekName(DayOfWeek.FRIDAY));
    }

    @Test
    void isWeekend() {
        assertTrue(new SwitchExpression().isWeekend(6));
    }

    @Test
    void isWeekend2() {
        assertFalse(new SwitchExpression().isWeekend2(4));
    }

    @Test
    void printIsWeekend() {
        new SwitchExpression().printIsWeekend(DayOfWeek.FRIDAY);
    }

}

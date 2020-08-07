package helpfulnpes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

// Note: Run with -XX:+ShowCodeDetailsInExceptionMessages
class HelpfulNPEsTest {

    @Test
    void whereDoesHomelessGuyLive() {
        HelpfulNPEs.Department department = new HelpfulNPEs().getDepartment();
        System.out.println(department.getEmployees().get(2).getAddress().getCity());
    }

    @Test
    void howOldIsTimothy() {
        HelpfulNPEs.Department department = new HelpfulNPEs().getDepartment();
        int age = department.getEmployees().get(0).getAge();
        System.out.println(age);
    }
}

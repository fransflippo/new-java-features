package helpfulnpes;

import lombok.Value;
import records.Point;

import java.util.Arrays;
import java.util.List;

public class HelpfulNPEs {

    @Value
    public static class Address {
        String street;
        String city;
        String postalCode;
    }

    @Value
    public static class Employee {
        String name;
        Address address;
        Integer age;
    }

    @Value
    public static class Department {
        String name;
        List<Employee> employees;
    }

    public Department getDepartment() {
        Employee timothy = new Employee("Timothy", new Address("219 Main Rd", "Bryanston", "2191"), null);
        Employee groovy = new Employee("Groovy", new Address("35 Oak St", "Randburg", "2193"), 45);
        Employee homelessGuy = new Employee("Jim", null, 53);
        Department department = new Department("VAT IT", Arrays.asList(timothy, groovy, homelessGuy));
        return department;
    }
}

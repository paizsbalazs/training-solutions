package introdate;

import java.time.LocalDate;
import java.time.Month;

public class EmployeeTest {

    public static void main(String[] args) {
        Employee employee = new Employee(2000, 1,10, "Kiss István");
        System.out.println(employee.getName() + " " + employee.getDateOfBirth() + " " + employee.getBegin());
    }
}

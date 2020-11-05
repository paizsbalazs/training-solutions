package introdate;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Employee {

    private String name;
    private LocalDate dateOfBirth;
    private LocalDateTime begin;

    public Employee(int year, int month, int day, String name) {
        this.name = name;
        this.dateOfBirth = LocalDate.of(year, month, day);
        this.begin = LocalDateTime.now();
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public LocalDateTime getBegin() {
        return begin;
    }
}

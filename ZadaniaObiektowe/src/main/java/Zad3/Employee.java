package Zad3;

import java.time.LocalDate;
import java.time.Period;

public class Employee {
    private String name;
    private String lastName;
    private LocalDate dateOfBirth;
    private LocalDate currentDate = LocalDate.now();

    public int age(LocalDate dateOfBirth, LocalDate currentDate) {
        return Period.between(dateOfBirth, currentDate).getYears();
    }

    public Employee(String name) {
        this.name = name;
    }


    public Employee(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;

    }

    public Employee(String name, String lastName, LocalDate dateOfBirth) {
        this.name = name;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", currentDate=" + currentDate +
                '}';
    }
}

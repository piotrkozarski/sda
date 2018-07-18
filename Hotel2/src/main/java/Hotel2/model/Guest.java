package Hotel2.model;

import java.time.LocalDate;
import java.time.Period;

public class Guest {
    private String name;
    private String lastname;
    private LocalDate dateOfBirth;

    public Guest(String name, String lastname, LocalDate dateOfBirth) {
        this.name = name;
        this.lastname = lastname;
        this.dateOfBirth = dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public boolean isAdult() {
        return Period.between(dateOfBirth, LocalDate.now()).getYears() >= 18;
    }

    @Override
    public String toString() {
        return "Guest{" +
                "name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }
}

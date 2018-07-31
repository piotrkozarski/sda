package ZadaniaObiektowe;

import java.time.LocalDate;
import java.time.Period;

public class Employee {
    private LocalDate dateOfBirth;  // LocalDate.of(1981, 02, 04);
    private LocalDate currentDate = LocalDate.now();
    private Sex sex;
    private long pesel;

    public Employee(LocalDate dateOfBirth, Sex sex, long pesel) {

        this.dateOfBirth = dateOfBirth;
        this.sex = sex;
        this.pesel = pesel;

    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public Sex getSex() {
        return sex;
    }

    public void setPesel(long pesel) {
        this.pesel = pesel;
    }

    public long getPesel() {
        return pesel;
    }

    public int getAge() {
        return Period.between(dateOfBirth, currentDate).getYears();
    }
}

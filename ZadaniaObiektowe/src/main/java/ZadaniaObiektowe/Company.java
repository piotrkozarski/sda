package ZadaniaObiektowe;

import java.time.LocalDate;

public class Company {

    public static void main(String[] args) {


        Employee employee1 = new Employee(LocalDate.of(1981, 02, 04), Sex.MALE, 81020414310L);
        Employee employee2 = new Employee(LocalDate.of(1990, 05, 07), Sex.FEMALE, 90050734234L);

        System.out.println("dane pracownika nr 1: ");
        System.out.println("data urodzenia: " + employee1.getDateOfBirth());
        System.out.println("wiek: " + employee1.getAge());
        System.out.println("płeć: " + employee1.getSex());
        System.out.println("pesel: " + employee1.getPesel());

    }
}

package Zad3;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Company {
    public static void main(String[] args) {
        Employee employee1 = new Employee("jan");
        Employee employee2 = new Employee("adam", "nowak");
        Employee employee3 = new Employee("zenon", "kowalski", LocalDate.of(1970, 4, 30));


        List<Employee> employees = new ArrayList<>();
        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);


        for (Employee employee : employees) {
            System.out.println(employee);

        }
    }

}

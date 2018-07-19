package StreamTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapApp {
    public static void main(String[] args) {
        List<Address> departments1 = new ArrayList<>(Arrays.asList(new Address("Poland 1a", "Szczecin", "Wyszynskiego 5"),
                new Address("Poland 1b", "Gdańsk", "Wojska Polskiego 3/5"),
                new Address("Poland 1c", "Warszawa", "Aleje Jerozolskie 1")));

        Company company1 = new Company("firma1", new Persons("jan", 23), departments1);

        List<Address> departments2 = new ArrayList<>(Arrays.asList(new Address("Poland 2a", "Szczecin", "Wyszynskiego 5"),
                new Address("Poland 2b", "Gdańsk", "Wojska Polskiego 3/5"),
                new Address("Poland 2c", "Warszawa", "Aleje Jerozolskie 1")));

        Company company2 = new Company("firma1", new Persons("jan", 23), departments2);


        List<Address> departments3 = new ArrayList<>(Arrays.asList(new Address("Poland 3a", "Szczecin", "Wyszynskiego 5"),
                new Address("Poland 3b", "Gdańsk", "Wojska Polskiego 3/5"),
                new Address("Poland 3c", "Warszawa", "Aleje Jerozolskie 1")));

        Company company3 = new Company("firma1", new Persons("jan", 23), departments3);

        List<Company> allDepartments = Arrays.asList(company1,company2,company3);
        allDepartments.stream()
                .map(department -> department.getDepartments())
                .flatMap(departmentss -> departmentss.stream())
                .collect(Collectors.toList())
                .forEach(System.out::println);

    }
}

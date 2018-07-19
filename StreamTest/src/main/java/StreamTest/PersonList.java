package StreamTest;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PersonList {


    public static void main(String[] args) {
        List<Persons> personsList = Arrays.asList(new Persons("jan"),
                new Persons("anna"),
                new Persons("zenon"));
        personsList.stream()
                .collect(Collectors.toList())
                .forEach(name -> System.out.println(name));



    }
}

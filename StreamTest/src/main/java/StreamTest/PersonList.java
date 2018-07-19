package StreamTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PersonList {

    public static void main(String[] args) {
        List<Persons> personsList = new ArrayList<>(Arrays.asList(new Persons("jan", 17),  //to new ArrayList musi być dodane,
                new Persons("anna", 20),                                                    // mimo że asList samo wywołuje new ArrayList,
                new Persons("zenon", 23)));                                                 // ale bez tego sie wywala, szczegoly na stakoverflon
        personsList.stream()
                .collect(Collectors.toList())
                .forEach(name -> System.out.println(name));
        System.out.println();

        Predicate<Persons> personsPredicate = (persons -> (persons.getAge() < (18)) || (persons.getAge() < 21 && persons.getName().endsWith("a")));
        personsList.removeIf(personsPredicate);
        personsList.forEach(persons -> System.out.println(persons));

    }
}

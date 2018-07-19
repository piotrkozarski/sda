package StreamTest;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(-9);
        list.add(-5);
        list.add(4);
        list.add(7);
        list.add(9);
        list.add(-8);


        List<Integer> onlyMinusList = list.stream()
                .filter(list1 -> list1 < 0)
                .sorted()
                .collect(Collectors.toList());

        onlyMinusList.forEach(list1 -> System.out.println(list1));
        System.out.println();


        Stream.of(1, 2, 3, 4, 5, 6, 7, -1, -2, -3)
                .filter(list1 -> list1 < 0)
                .sorted()
                .collect(Collectors.toList())
                .forEach(System.out::println);

    }
}


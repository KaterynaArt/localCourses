
package homework30;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class Launcher {

    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Alice", 30),
                new Person("Bob", 22),
                new Person("Charlie", 28),
                new Person("David", 26)
        );

        List<String> filteredAndSortedPeople = people.stream()
                .filter(x -> x.getAge() > 25)
                .sorted((x1, x2) -> x1.getName().compareTo(x2.getName()))
                .map(x -> x.getName() + " - " + x.getAge())
                .collect(Collectors.toList());

        filteredAndSortedPeople.forEach(System.out::println);
    }
}

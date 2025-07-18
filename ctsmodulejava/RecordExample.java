import java.util.*;
import java.util.stream.*;

public record Person(String name, int age) {}

public class RecordExample {
    public static void main(String[] args) {
        List<Person> people = List.of(new Person("Alice", 30), new Person("Bob", 20));
        people.forEach(System.out::println);
        List<Person> adults = people.stream().filter(p -> p.age() >= 18).toList();
        System.out.println("Adults: " + adults);
    }
}

import java.util.*;
import java.util.stream.*;

public class StreamApiDemo {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        List<Integer> evens = numbers.stream().filter(x -> x%2==0).collect(Collectors.toList());
        System.out.println("Even numbers: " + evens);
    }
}

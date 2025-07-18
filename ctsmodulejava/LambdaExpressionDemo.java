import java.util.*;

public class LambdaExpressionDemo {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple","banana","pear","peach");
        Collections.sort(list, (a, b) -> a.compareTo(b));
        System.out.println(list);
    }
}

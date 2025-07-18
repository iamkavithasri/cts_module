public class PatternMatchingSwitch {
    static void typeCheck(Object obj) {
        String result = switch (obj) {
            case Integer i -> "Integer: " + i;
            case String s -> "String: " + s;
            case Double d -> "Double: " + d;
            default -> "Unknown type";
        };
        System.out.println(result);
    }
    public static void main(String[] args) {
        typeCheck("hello");
        typeCheck(10);
        typeCheck(3.14);
    }
}

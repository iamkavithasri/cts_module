public class OperatorPrecedence {
    public static void main(String[] args) {
        int expr1 = 10 + 5 * 2;
        int expr2 = (10 + 5) * 2;
        System.out.println("10 + 5 * 2 = " + expr1 + " (Multiplication has higher precedence)");
        System.out.println("(10 + 5) * 2 = " + expr2 + " (Parentheses evaluated first)");
    }
}

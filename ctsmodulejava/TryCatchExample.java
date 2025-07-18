import java.util.Scanner;

public class TryCatchExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two integers: ");
        int n1 = sc.nextInt(), n2 = sc.nextInt();
        try {
            System.out.println("Result: " + (n1 / n2));
        } catch (ArithmeticException ex) {
            System.out.println("Division by zero is not allowed.");
        }
        sc.close();
    }
}

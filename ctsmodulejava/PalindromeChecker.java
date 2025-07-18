import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        String clean = str.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        String rev = new StringBuilder(clean).reverse().toString();
        if(clean.equals(rev))
            System.out.println("Palindrome.");
        else
            System.out.println("Not a palindrome.");
        sc.close();
    }
}

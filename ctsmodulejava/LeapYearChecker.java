import java.util.Scanner;

public class LeapYearChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter year: ");
        int year = sc.nextInt();
        boolean isLeap = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        if(isLeap)
            System.out.println(year + " is a leap year.");
        else
            System.out.println(year + " is not a leap year.");
        sc.close();
    }
}

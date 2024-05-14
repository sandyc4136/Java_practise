import java.util.Scanner;

public class DivisibilityChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (number % 3 == 0) {
            System.out.println("RAJA");
        }

        if (number % 5 == 0) {
            System.out.println("Software");
        }

        scanner.close();
    }
}

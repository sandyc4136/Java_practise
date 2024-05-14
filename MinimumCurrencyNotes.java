import java.util.Scanner;

public class MinimumCurrencyNotes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Available currency denominations
        int[] denominations = {100, 50, 10, 5, 2, 1};

        System.out.print("Enter the amount: ");
        int amount = scanner.nextInt();

        System.out.println("Minimum number of currency notes needed:");

        // Iterate through each denomination
        for (int i=0;i<denominations.length;i++) {
            // Calculate the number of notes of current denomination
            int count = amount / denominations[i];
            if (count > 0) {
                System.out.println(denominations[i] + " x " + count);
            }
            // Update the remaining amount
            amount %= denominations[i];
        }

        scanner.close();
    }
}

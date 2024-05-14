import java.util.Scanner;

public class NumberToWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        printNumberInWords(number);

        scanner.close();
    }

    // Method overloading for single-digit numbers
    private static void printNumberInWords(int num) {
        String[] words = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
        if (num >= 0 && num <= 9) {
            System.out.println(words[num]);
        } else {
            System.out.println("Number out of range (0-9).");
        }
    }

    // Method overloading for two-digit numbers
    private static void printNumberInWords(int tens, int ones) {
        String[] tensWords = {"", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
        String[] onesWords = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};

        if (tens >= 2 && tens <= 9 && ones >= 0 && ones <= 9) {
            System.out.println(tensWords[tens] + " " + onesWords[ones]);
        } else {
            System.out.println("Invalid input for two-digit number.");
        }
    }

    // Method overloading for three-digit numbers
    private static void printNumberInWords(int hundreds, int tens, int ones) {
        if (hundreds >= 1 && hundreds <= 9 && tens >= 0 && tens <= 9 && ones >= 0 && ones <= 9) {
            System.out.println(NumberToWords.convertToWords(hundreds) + " Hundred " +
                    NumberToWords.convertToWords(tens, ones));
        } else {
            System.out.println("Invalid input for three-digit number.");
        }
    }

    // Utility method to convert single-digit or two-digit numbers to words
    private static String convertToWords(int... digits) {
        StringBuilder result = new StringBuilder();
        for (int digit : digits) {
            result.append(NumberToWords.convertToWords(digit)).append(" ");
        }
        return result.toString().trim();
    }

    // Utility method to convert a single digit to words
    private static String convertToWords(int digit) {
        String[] words = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
        return words[digit];
    }
}

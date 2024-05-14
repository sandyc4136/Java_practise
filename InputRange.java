import java.util.Scanner;

public class InputRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int input=Integer.MIN_VALUE;
        
        // do {
        //     System.out.println("Enter a number between 0 and 499 (inclusive):");
        //     input = scanner.nextInt();
            
        //     if (input >= 0 && input <= 499) {
        //         System.out.println("Input is in the valid range.");
        //     } else {
        //         System.out.println("Input is not in the valid range. Please try again.");
        //     }
        // } while (input < 0 || input > 499);
        
        // System.out.println("Thank you for the valid input.");

        while(input < 0 || input > 499){
            input=scanner.nextInt();
            if (input >= 0 && input <= 499) {
                        System.out.println("Input is in the valid range.");
                    } else {
                        System.out.println("Input is not in the valid range. Please try again.");
                    }
        }
        System.out.println("Thank you for the valid input.");
        scanner.close();
    }
}

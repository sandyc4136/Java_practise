import java.util.Scanner;

public class StringReversal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        String reversedString = reverseString(inputString);

        System.out.println("Reversed string: " + reversedString);

        scanner.close();
    }

    // Function to reverse a string with O(n/2) complexity
    private static String reverseString(String input) {
        char[] charArray = input.toCharArray();
        int len = charArray.length;

        // for (int i = 0; i < length / 2; i++) {
        //     // Swap characters from both ends
        //     char temp = charArray[i];
        //     charArray[i] = charArray[length - 1 - i];
        //     charArray[length - 1 - i] = temp;
        // }

        for(int i=0,j=len-1;i<j;i++,j--){
           char temp = charArray[i];
           charArray[i]=charArray[j];
           charArray[j]=temp;        
        }
        return new String(charArray);
    }
}

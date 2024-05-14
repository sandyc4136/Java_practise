import java.util.Arrays;
import java.util.Comparator;

public class SortDescending {
    public static void main(String[] args) {
        int[] arr = {5, 3, 9, 1, 7, 2};
        
        // Sort array in descending order
        Arrays.sort(arr, Comparator.reverseOrder());
        
        // Print sorted array
        System.out.println("Sorted array in descending order: " + Arrays.toString(arr));
    }
}

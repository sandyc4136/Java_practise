public class SmallestNonRepeatingElement {
    public static int findSmallestNonRepeating(int arr1[], int[] arr2) {
        for (int i = 0; i < arr1.length; i++) {
            // int j;
            boolean repeated = false;
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    repeated=true;
                    break;
                }
            }
            // if (j == arr2.length) {
                if (!repeated) {
                // Element in arr1 not found in arr2
                int k;
                for (k = 0; k < arr1.length; k++) {
                    if (k != i && arr1[i] == arr1[k]) {
                        break;
                    }
                }
                if (k == arr1.length) {
                    // Non-repeating element found
                    return arr1[i];
                }
            }
        }
        // No non-repeating element found
        return -1;
    }

    public static void main(String[] args) {
        int[] arr1 = {10, -4, 2, 0, -2, 3, 7};
        int[] arr2 = {7, 3, -4, 0, 3, 2};
        System.out.println("Output 1: " + findSmallestNonRepeating(arr1, arr2)); // Output: 10

        int[] arr3 = {-2, 5, 1, -10, 5};
        int[] arr4 = {-2, -10};
        System.out.println("Output 2: " + findSmallestNonRepeating(arr3, arr4)); // Output: 1
    }
}
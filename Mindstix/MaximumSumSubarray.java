public class MaximumSumSubarray {
    public static void findMaxSumSubarray(int[] arr) {
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;
        int start = 0;
        int end = 0;
        int tempStart = 0;

        for (int i = 0; i < arr.length; i++) {
            currentSum += arr[i];

            if (currentSum > maxSum) {
                maxSum = currentSum;
                start = tempStart;
                end = i;
            }

            if (currentSum < 0) {
                currentSum = 0;
                tempStart = i + 1;
            }
        }

        System.out.println("Output: " + start + " " + end);
    }

    public static void main(String[] args) {
        int[] arr1 = {2, 3, 4, 5, 6, 7, 10};
        findMaxSumSubarray(arr1); // Output: 0 6

        int[] arr2 = {-2, -3, -4, 4, -2, -1, -3, 1, 5, -3, -4};
        findMaxSumSubarray(arr2); // Output: 3 8

        int[] arr3 = {-8, -3, -2, -4, -1};
        findMaxSumSubarray(arr3); // Output: 4 4
    }
}

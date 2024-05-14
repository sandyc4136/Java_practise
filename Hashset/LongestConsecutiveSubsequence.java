import java.util.*;;

public class LongestConsecutiveSubsequence {
    public static int longestConsecutiveSubsequence(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        Set<Integer> numSet = new HashSet<>();
        for (int num : nums) {
            numSet.add(num);
        }

        int longestLength = 0;

        for (int num : numSet) {
            // Check if the number is the start of a sequence
            if (!numSet.contains(num - 1)) {
                int currentNum = num;
                int currentLength = 1;

                // Check for consecutive numbers after the current number
                while (numSet.contains(currentNum + 1)) {
                    currentNum++;
                    currentLength++;
                }

                longestLength = Math.max(longestLength, currentLength);
            }
        }

        return longestLength;
    }

    public static void main(String[] args) {
        int[] nums = {11,3,5,2,4,25,15,1};
        System.out.println("Length of longest consecutive subsequence: " + longestConsecutiveSubsequence(nums));
    }
}

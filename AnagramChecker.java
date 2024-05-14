public class AnagramChecker {

    public static boolean areAnagrams(String str1, String str2) {
        // If lengths of two strings are not equal, they cannot be anagrams
        if (str1.length() != str2.length()) {
            return false;
        }

        // Create an array to store character frequencies
        int[] freq = new int[256]; // Assuming ASCII characters

        // Update frequencies for characters in first string
        for (int i = 0; i < str1.length(); i++) {
            char c = str1.charAt(i);
            
            freq[c]++;
            // System.out.println(freq[c]);
        }

        // Update frequencies for characters in second string
        for (int i = 0; i < str2.length(); i++) {
            char c = str2.charAt(i);
            freq[c]--;
        }

        // Check if all frequencies are zero
        for (int f : freq) {
            if (f != 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";

        if (areAnagrams(str1, str2)) {
            System.out.println("'" + str1 + "' and '" + str2 + "' are anagrams.");
        } else {
            System.out.println("'" + str1 + "' and '" + str2 + "' are not anagrams.");
        }
    }
}

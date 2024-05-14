import java.util.HashMap;
import java.util.Map;

public class Anagram {

    public static boolean areAnagrams(String str1, String str2) {
        // If lengths of two strings are not equal, they cannot be anagrams
        if (str1.length() != str2.length()) {
            return false;
        }

        // Create maps to store character frequencies in each string
        Map<Character, Integer> freqMap1 = new HashMap<>();
        Map<Character, Integer> freqMap2 = new HashMap<>();

        // Update frequencies for characters in first string
        for (char c : str1.toCharArray()) {
            freqMap1.put(c, freqMap1.getOrDefault(c, 0) + 1);
        }

        // Update frequencies for characters in second string
        for (char c : str2.toCharArray()) {
            freqMap2.put(c, freqMap2.getOrDefault(c, 0) + 1);
        }

        // Check if frequencies are the same for each character
        for (char c : freqMap1.keySet()) {
            if (!freqMap2.containsKey(c) || !freqMap1.get(c).equals(freqMap2.get(c))) {
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

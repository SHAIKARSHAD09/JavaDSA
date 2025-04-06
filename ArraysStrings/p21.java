package ArraysStrings;

import java.util.*;

public class p21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int res = findLongestSubstring(str);
        System.out.println(res);
    }

    public static int findLongestSubstring(String str) {
        int n = str.length();
        int maxi = 0; // To store the maximum length
        Set<Character> set = new HashSet<>(); // To store characters in the current window
        int left = 0; // Left pointer of the window

        for (int right = 0; right < n; right++) {
            // If the character at 'right' index is already in the set, shrink the window from the left
            while (set.contains(str.charAt(right))) {
                set.remove(str.charAt(left));
                left++;
            }

            // Add the current character to the set and update maximum length
            set.add(str.charAt(right));
            maxi = Math.max(maxi, right - left + 1);
        }

        return maxi;
    }
}

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int maxLength = 0;
        Map<Character, Integer> charMap = new HashMap<>();
        int left = 0;
        
        for (int right = 0; right < n; right++) {
            if (!charMap.containsKey(s.charAt(right)) || charMap.get(s.charAt(right)) < left) {
                charMap.put(s.charAt(right), right);
                maxLength = Math.max(maxLength, right - left + 1);
            } else {
                left = charMap.get(s.charAt(right)) + 1;
                charMap.put(s.charAt(right), right);
            }
        }
        
        return maxLength;
    }
}
package array;

import java.util.HashSet;

public class LongestSubstring {
    public static int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int longest = 0, left = 0;
        char[] carac = s.toCharArray();

        for (int right = 0; right < carac.length;right++) {

            while (set.contains(carac[right])) {
                set.remove(carac[left]);
                left++;
            }

            set.add(carac[right]);
            longest = Math.max(longest, (right - left) + 1);
        }
        return longest;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcbb"));
        System.out.println(lengthOfLongestSubstring("bbbbb"));
    }
}
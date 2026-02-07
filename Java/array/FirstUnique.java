package array;

public class FirstUnique {
    public static int firstUniqChar(String s) {
        // fast return
        if (s == null || s.isEmpty()) return -1;

        // take care with upperCase letters
        String sLowerCase = s.toLowerCase();

        int[] count = new int[26];

        for (int i = 0; i < sLowerCase.length(); i++) {
            count[sLowerCase.charAt(i) - 'a']++;
        }

        for (int i = 0; i < sLowerCase.length(); i++) {
            int actualLetterIndex = sLowerCase.charAt(i) - 'a';
            if (count[actualLetterIndex] == 1) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        System.out.println(firstUniqChar("leetcode"));     // 0 (o 'l')
        System.out.println(firstUniqChar("loveleetcode")); // 2 (o 'v')
        System.out.println(firstUniqChar("aabb"));         // -1
    }
}
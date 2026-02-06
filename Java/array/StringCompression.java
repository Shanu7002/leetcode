package array;

public class StringCompression {

    public static String compress(String str) {
        if (str == null || str.isEmpty()) return "";

        StringBuilder answer = new StringBuilder();
        char[] letters = str.toCharArray();

        for (int i = 0; i < letters.length; i++) {
            int count = 1;

            while(i + 1 < letters.length && letters[i] == letters[i + 1]) {
                count++;
                i++;
            }

            answer.append(letters[i]).append(count);
        }

        if (answer.length() > str.length()) {
            return str;
        }

        return answer.toString();
    }

    public static void main(String[] args) {
        System.out.println(compress("aaabb"));    // a3b2
        System.out.println(compress("abc"));      // abc (porque a1b1c1 é maior)
        System.out.println(compress("aabcccccaaa")); // a2b1c5a3
    }
}
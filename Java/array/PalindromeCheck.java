package array;

public class PalindromeCheck {

    public static boolean isPalindrome(String word) {
        if (word == null || word.isEmpty()) return false;

        String newWord = word.toLowerCase();

        for (int i = 0; i < newWord.length() /  2; i++){
            if (newWord.charAt(i) != newWord.charAt(newWord.length() - (i + 1))) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("Deleveled"));
        System.out.println(isPalindrome("Axur"));
    }
}
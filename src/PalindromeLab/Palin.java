package PalindromeLab;

public class Palin {
    public static String isPalin (String word) {
        String bword = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            bword = bword + word.charAt(i);
        }

        if (word.equals(bword)) {
            return word + " is a palindrome.";
        } else {
            return word + " is not a palindrome.";
        }
    }
}

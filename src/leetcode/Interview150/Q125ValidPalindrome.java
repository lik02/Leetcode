package leetcode.Interview150;

public class Q125ValidPalindrome {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
    }
    // public static boolean isPalindrome(String s) {
    //     s = s.toLowerCase();
    //     s = s.replaceAll(" ", "");
    //     s = s.replaceAll("[!-/]", "");
    //     s = s.replaceAll("[:-@]", "");
    //     s = s.replaceAll("[[-_]]", "");
    //     s = s.replaceAll("^", "");
    //     s = s.replaceAll("[_-`]", "");
    //     s = s.replace("\\", "");
    //     s = s.replace("[", "");
    //     s = s.replace("]", "");
    //     s = s.replaceAll("[{-~]", "");
    //     for (int i = 0; i < s.length() / 2; i++) {
    //         if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
    //             return false;
    //         }
    //     }
    //     return true;
    // }

    public static boolean isPalindrome(String s) {
        String hold = "";
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetterOrDigit(s.charAt(i))) {
                hold += s.charAt(i);
            }
        }
        hold = hold.toLowerCase();
        for (int i = 0; i < hold.length() / 2; i++) {
            if (hold.charAt(i) != hold.charAt(hold.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}

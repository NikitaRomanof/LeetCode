/*
Given two strings s and t, return true if s is a subsequence of t, or false otherwise.
A subsequence of a string is a new string that is formed from the original string
by deleting some (can be none) of the characters without disturbing the relative positions of the remaining characters.
(i.e., "ace" is a subsequence of "abcde" while "aec" is not).
*/

public class IsSubsequence {
    public static void main(String[] args) {
        System.out.println(isSubsequence("abc", "ahbgdc"));
    }

    public static boolean isSubsequence(String s, String t) {
        if (s.length() > t.length()) return false;
        int lenT = 0;
        boolean countTrue = false;
        for (int i = 0; i < s.length(); ++i) {
            char check = s.charAt(i);
            for (; lenT < t.length(); ) {
                if (check == t.charAt(lenT)) {
                    countTrue = true;
                    lenT++;
                    break;
                }
                lenT++;
            }
            if (countTrue == false) return false;
            countTrue = false;
        }
        return true;
    }
}

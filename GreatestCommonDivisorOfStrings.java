/*
For two strings s and t, we say "t divides s" if and only if s = t + t + t + ... + t + t (i.e., t is concatenated with itself one or more times).

Given two strings str1 and str2, return the largest string x such that x divides both str1 and str2.

 

Example 1:

Input: str1 = "ABCABC", str2 = "ABC"
Output: "ABC"

Example 2:

Input: str1 = "ABABAB", str2 = "ABAB"
Output: "AB"

Example 3:

Input: str1 = "LEET", str2 = "CODE"
Output: ""


*/
class GreatestCommonDivisorOfStrings {
    public String gcdOfStrings(String str1, String str2) {
        if (str1 == null || str1.isEmpty() || str2 == null || str2.isEmpty()) {
            return "";
        }
       if (!(str1 + str2).equals((str2 + str1))) {
            return "";
        }
        if (str1.length() % str2.length() == 0) {
            return str2;
        }
       
       if (str2.length() % str1.length() == 0) {
            return str1;
        }
        
        int l1 = str1.length();
        int l2 = str2.length();
       while(l2 != 0){
            int temp = l2;
            l2 = l1 % l2;
            l1 = temp;
        }
        return str1.substring(0, l1);
    }
}

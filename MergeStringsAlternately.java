/*
You are given two strings word1 and word2. Merge the strings by adding letters in alternating order, starting with word1. If a string is longer than the other, append the additional letters onto the end of the merged string.

Return the merged string.

 

Example 1:

Input: word1 = "abc", word2 = "pqr"
Output: "apbqcr"
Explanation: The merged string will be merged as so:
word1:  a   b   c
word2:    p   q   r
merged: a p b q c r

Example 2:

Input: word1 = "ab", word2 = "pqrs"
Output: "apbqrs"
Explanation: Notice that as word2 is longer, "rs" is appended to the end.
word1:  a   b 
word2:    p   q   r   s
merged: a p b q   r   s

Example 3:

Input: word1 = "abcd", word2 = "pq"
Output: "apbqcd"
Explanation: Notice that as word1 is longer, "cd" is appended to the end.
word1:  a   b   c   d
word2:    p   q 
merged: a p b q c   d
*/


public class App {
  public static void main(String[] args) {
    
  }

  public static String mergeAlternately(String word1, String word2) {
        if ((word1 == null && word2 == null) ||
            (word1.isEmpty() && word2.isEmpty())) {
                return "";
        }
        if (word1== null || word1.isEmpty()) {
            return word2;
        }

        if (word2== null || word2.isEmpty()) {
            return word1;
        }
        char[] merged = new char[word1.length() + 
        (word2.length() > word1.length() ? word1.length() : word2.length())];

        for (int i = 0, j = 0; i < word1.length(); ++i) {
            merged[j] = word1.charAt(i);
            ++j;
            if (i < word2.length()) {
                merged[j] = word2.charAt(i);
                ++j;
            }
        }
        return word2.length() > word1.length() ? String.valueOf(merged) + word2.substring(word1.length()) : String.valueOf(merged);

  }
  
}

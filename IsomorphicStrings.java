/*
Given two strings s and t, determine if they are isomorphic.
Two strings s and t are isomorphic if the characters in s can be replaced to get t.
All occurrences of a character must be replaced with another character while preserving the order of characters.
No two characters may map to the same character, but a character may map to itself.
*/

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(isIsomorphic("egg", "add"));
    }

    public static boolean isIsomorphic(String s, String t) {
        short[] sChar = new short[256];
        short[] tChar = new short[256];
        Arrays.fill(sChar, (short)-1);
        Arrays.fill(tChar, (short)-1);

        for(int i = 0; i < s.length(); i++){
            short ss = (short)s.charAt(i);
            short tt = (short)t.charAt(i);
            if (sChar[ss] == -1 && tChar[tt] == -1){
                sChar[ss] = tt;
                tChar[tt] = ss;
            } else if (sChar[ss] != tt
                    || tChar[tt] != ss) {
                return false;
            }
        }
        return true;
    }

}

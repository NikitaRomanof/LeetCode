/*
You are given two strings s1 and s2 of equal length.
A string swap is an operation where you choose two indices in a string (not necessarily different) and swap the characters at these indices.

Return true if it is possible to make both strings equal by performing at most one string swap on exactly one of the strings.
Otherwise, return false.

*/

public class StringSwapEquals {

    public static void main(String[] args) {
        System.out.println(areAlmostEqual("bank", "kanb"));
    }

    public static boolean areAlmostEqual(String s1, String s2) {
        if (s1.equals(s2)) return true;
        short tmp1 = 0, tmp2 = 0, tmp11 = 0, tmp22 = 0;
        byte br = 0;
        for (int i = 0; i <s1.length(); ++i) {
            char c1 = s1.charAt(i);
            char c2 = s2.charAt(i);
            if (c1 != c2 && br == 0) {
                tmp1 = (short) c1;
                tmp2 = (short) c2;
                br = 1;
            } else if (c1 != c2 && br == 1) {
                tmp11 = (short) c1;
                tmp22 = (short) c2;
                br = 2;
            } else if (c1 != c2) {
                return false;
            }
        }
        return (tmp1 == tmp22 && tmp2 == tmp11);
    }

}

/*
Write a function that takes the binary representation of an unsigned integer and returns the number of '1' bits it has (also known as the Hamming weight).
Note:
Note that in some languages, such as Java, there is no unsigned integer type. In this case, the input will be given as a signed integer type.
It should not affect your implementation, as the integer's internal binary representation is the same, whether it is signed or unsigned.
In Java, the compiler represents the signed integers using 2's complement notation. Therefore, in Example 3, the input represents the signed integer. -3.
*/

public class NumberOfOneBits {
    public static void main(String[] args) {
        System.out.println(hammingWeight(00000000000000000000000000001011));
    }
    public static int hammingWeight(int n) {
        char[] rez = Integer.toBinaryString(n).toCharArray();
        int count = 0;
        for (char x : rez) {
            if (x == '1') count++;
        }
        return count;
    }

}

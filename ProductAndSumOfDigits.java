/*
Given an integer number n, return the difference between the product of its digits and the sum of its digits.
*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProductAndSumOfDigits {
    public static void main(String[] args) {
        System.out.println(subtractProductAndSum(4421));
    }
    public static int subtractProductAndSum(int n) {
        List<Integer> list = new ArrayList<>();
        while (n != 0) {
            list.add(n%10);
            n /= 10;
        }
        Collections.reverse(list);
        int sum = 0;
        int mul = 1;
        for (int x : list) {
            sum += x;
            mul *= x;
        }
        return mul - sum;
    }
}

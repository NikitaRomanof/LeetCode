// Given two non-negative integers low and high. Return the count of odd numbers between low and high (inclusive).

public class Main {
    public static void main(String[] args) {
        System.out.println(countOdds(3, 7));
    }


    public static int countOdds(int low, int high) {
        if((low % 2) + (high % 2) > 0){
            return (high - low) / 2 + 1;
        }
        return (high - low) / 2;
    }

}

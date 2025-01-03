package leetcode;
import java.util.Arrays;

public class SquareNSum {
    //https://www.codewars.com/kata/515e271a311df0350d00000f/train/java

    public static void main(String[] args) {
     int[] arr = {1, 2, 2};
        System.out.println(squareSum(arr));
    }

    public static int squareSum(int[] n) {
        int result = 0;
        for(int c : n){
        result += c * c;
     }
     return result;
    }
    public static int squareSum2(int[] n) {
        int sum = 0;
        for (int i = 0; i < n.length; i++) {
            sum += n[i] * n[i];
        }
        return sum;
    }
    public static int squareSumWithStream(int[] n){
        return Arrays.stream(n).map(i -> i * i).sum();
    }
}


package leetcode;

import java.util.Arrays;
import java.util.stream.IntStream;

public class FindTheSmallestInteger {
    public static void main(String[] args) {
        int[] arr = {34, -345, -1, 100};
        System.out.println(findSmallestInt(arr));
        System.out.println(findSmallestNumberWithLoops(arr));
        System.out.println(findSmallestWithStream(arr));
    }

    public static int findSmallestInt(int[] args) {
        Arrays.sort(args);
        return args[0];
    }

    public static int findSmallestNumberWithLoops(int[] args) {
        int min = Integer.MAX_VALUE;
        for (int c : args) {
            if (min > c) {
                min = c;
            }
        }
        return min;
    }

    public static int findSmallestWithStream(int[] args){
      return IntStream.of(args).min().getAsInt();
    }
}

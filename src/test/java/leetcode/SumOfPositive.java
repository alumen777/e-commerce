package leetcode;
import java.util.stream.IntStream;

public class SumOfPositive {
    //https://www.codewars.com/kata/5715eaedb436cf5606000381/train/java
    public static void main(String[] args) {
        // @Test
        //    public void testSomething() {
        //        assertEquals(15, Positive.sum(new int[]{1,2,3,4,5}));
        //        assertEquals(13, Positive.sum(new int[]{1,-2,3,4,5}));
        //        assertEquals(0, Positive.sum(new int[]{}));
        //        assertEquals(0, Positive.sum(new int[]{-1,-2,-3,-4,-5}));
        //        assertEquals(9, Positive.sum(new int[]{-1,2,3,4,-5}));
        //    }
        //[1, -4, 7, 12] =>1+7+12=20

        System.out.println(sum(new int[]{-1, -2, -3, -4, -5}));
        System.out.println(sum2(new int[]{-1, -2, -3, -4, -5}));

    }

    public static int sum(int[] arr) {
        int sum = 0;
        for (int s : arr) {
            if (s > 0) {
                sum += s;
            }
        }
        return sum;
    }
    public static int sum2(int[] arr) {
        return IntStream.of(arr)
                .map(x -> x > 0 ? x : 0 ) // transforming negative numbers into 0 with map
                .sum();
    }
}
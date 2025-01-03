package leetcode;
import java.util.Arrays;
import java.util.stream.IntStream;
//https://www.codewars.com/kata/56f69d9f9400f508fb000ba7/train/java
//10 --> [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
// 1 --> [1]
// assertArrayEquals(new int[]{1,2,3,4,5},MonkeyCounter.monkeyCount(5));
public class CountTheMonkeys {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(monkeyCount(5)));
        System.out.println(monkeyCountWithStream(5));


    }
    public static int[] monkeyCount(final int n){
        int [] arr = new int[n];
        for(int i = 0; i < n; i++){
         arr[i] = i + 1;
        }
        return arr;
    }
    public static int[] monkeyCountWithStream(final int n) {
    return IntStream.rangeClosed(1, n).toArray();
    }

}

package leetcode;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;


public class SumOfArraySingle {
    //https://www.codewars.com/kata/59f11118a5e129e591000134/train/java
    public static void main(String[] args) {
        //For example, repeats([4,5,7,5,4,8]) = 15
        // because only the numbers 7 and 8 occur once, and their sum is 15. Every other number occurs twice.

        System.out.println(repeats(new int[]{4,5,7,5,4,8}));
    }
    public static int repeats(int [] arr){
     Map<Integer, Integer> map = new HashMap<>();
      for(int num : arr){
          if(!map.containsKey(num)){
              map.put(num, 1);
          }else {
              map.put(num, map.get(num) + 1);
          }
      }
      int sum =0;
      for(Map.Entry entry : map.entrySet()){
          if(entry.getValue().equals(1)){
              sum+= (Integer)entry.getKey();
          }
      }
      return sum;
    }

    // with stream
    public static int repeats2(int[] arr){
        return 2 * IntStream.of(arr).distinct().sum() - IntStream.of(arr).sum();
    }
}

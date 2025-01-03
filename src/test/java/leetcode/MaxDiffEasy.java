package leetcode;
import java.util.Arrays;

public class MaxDiffEasy {
   // https://www.codewars.com/kata/588a3c3ef0fbc9c8e1000095/train/java
    //You must implement a function that returns the difference between the largest and the smallest value in a given list / array (lst) received as the parameter.
   //
   //lst contains integers, that means it may contain some negative numbers
   //if lst is empty or contains a single element, return 0
   //lst is not sorted
   //[1, 2, 3, 4]   //  returns 3 because 4 -   1  == 3
   //[1, 2, 3, -4]  //  returns 7 because 3 - (-4) == 7
   public static void main(String[] args) {
       System.out.println(maxDiff(new int[]{1, 2, 3, -4}));
       System.out.println(maxDiffWithStream(new int[]{1, 2, 3, -4}));

   }
    public static int maxDiff(int[] lst) {
       if(lst == null || lst.length <= 1){
           return 0;
       }
       Arrays.sort(lst);
      int result =  lst[lst.length -1] - lst[0];
      return result;
    }
    public static int maxDiffWithStream(int[] lst) {
      return lst.length <=1 ? 0 :
              Arrays.stream(lst).max().getAsInt() - Arrays.stream(lst).min().getAsInt();
    }
}

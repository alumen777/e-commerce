package leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSumNumbers {

    // find indexes of 2 numbers, which sum would be equal to total
    //ex  total = 9; numbers [2,7,8,9,], answer : indexes [0, 1]

    public static void main(String[] args) {
        int[] numbers = {1, 44, 7, 22, 12, 2};
        int total = 9;
        System.out.println(Arrays.toString(twoSum(numbers,total)));
        System.out.println(Arrays.toString(twoSumWithHashMap(numbers,total)));


    }

    public static int[] twoSum(int[] numbers, int total) {
        int[] result = new int[2];
        for (int i = 0; i < numbers.length -1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if( total == numbers[i] + numbers[j]){
                   /* result[0] = i;
                    result[1] = j;
                    return result;*/
                    return new int[] { i, j };
                }
            }
        }
        return null;
    }
    // with hashmap
    public static int[] twoSumWithHashMap(int [] arr, int total){
       Map<Integer, Integer> map = new HashMap<>();
        for (int i =0; i < arr.length; i++){
            int current = arr[i];
            int diff = total - current;
            if (map.containsKey(diff)){
                return new int [] {map.get(diff), i};
            }
            map.put(current, i);
        }
       return null;
    }
}

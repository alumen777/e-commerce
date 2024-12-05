package leetcode;

import java.util.*;

public class ContainsDuplicates {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};
        int[] numbers = {7, 2, 3, 0};

       // System.out.println(containDuplicates(nums));
        System.out.println(containDuplicatesWithMap(numbers));

    }
    public static boolean containDuplicates(int[] numbers){

        List<Integer> list = new ArrayList<>();
        for(int value : numbers){
            list.add(value);
        }
       Integer filtered = list.stream()
               .distinct()
               .toList().size();
        return filtered < numbers.length;

    }
    public static boolean containDuplicatesWithMap(int [] numbers){
        Map<Integer, Integer> mapDuplicates = new HashMap<>();

        for( int number : numbers){
            if(!mapDuplicates.containsKey(number)){
                mapDuplicates.put(number,1);
            } else {
                return true;
            }
        }
        return false;
    }

}

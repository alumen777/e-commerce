package leetcode;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class FlattenSortArray {
    public static void main(String[] args) {
        //https://www.codewars.com/kata/57ee99a16c8df7b02d00045f/train/java
        //Given [[3, 2, 1], [4, 6, 5], [], [9, 7, 8]], your function should return [1, 2, 3, 4, 5, 6, 7, 8, 9].

        //Given [[3, 2, 1], [4, 6, 5], [], [9, 7, 8]], your function should return [1, 2, 3, 4, 5, 6, 7, 8, 9].
        System.out.println(Arrays.toString(flattenAndSort(new int [][]{{3, 2, 1},{4, 6, 5},{},{9,7,8}})));
        System.out.println(Arrays.toString(flattenAndSort2(new int [][]{{3, 2, 1},{4, 6, 5},{},{9,7,8}})));
    }
    public static int[] flattenAndSort(int[][] array) {
        int newArrayLength = 0;
        for(int[] row : array){
           newArrayLength += row.length;
        }
        int[] resultArray = new int[newArrayLength];
        int index = 0;
        for(int[] n : array){
            for(int a : n ) {
                resultArray[index++] = a;
            }
        }
        Arrays.sort(resultArray);
        return resultArray;
    }
    public static int[] flattenAndSort2(int[][] array){
        List<Integer> list = new ArrayList<>();
        for(int[] c : array){
            for(int a : c){
                list.add(a);
            }
        }
        Collections.sort(list);
        int[] result = new int [list.size()];
        int index = 0;
        for(int l : list){
            result[index++] = l;
        }
        return result;
    }
}

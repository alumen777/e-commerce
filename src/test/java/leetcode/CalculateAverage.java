package leetcode;
import java.util.Arrays;;

import java.util.stream.DoubleStream;

import static java.util.Arrays.stream;

public class CalculateAverage {
    //https://www.codewars.com/kata/57a2013acf1fa5bfc4000921/train/java
    //public void testSomething() {
    //        assertEquals(1, Kata.find_average(new int[]{1,1,1}), DELTA);
    //        assertEquals(2, Kata.find_average(new int[]{1, 2, 3}), DELTA);
    //    }
    public static void main(String[] args) {
        System.out.println(find_average(new int[]{1, 2, 3}));
        System.out.println(find_averageWithLoop(new int[]{1 ,2, 3}));
        System.out.println(find_averageWitStream(new int[]{1, 2, 3}));

    }

    public static double find_average(int[] array){
     return stream(array)
             .average()
             .orElse(0.00);
            // .orElseThrow(() -> new RuntimeException("Array is empty"));
    }
    public static double find_averageWithLoop (int[] array){
        if(array.length == 0){
            return 0.00;
        }
        double sum = 0.00;
        for(int c : array){
            sum += c ;
        }
        return sum/array.length ;
    }

    public static double find_averageWitStream(int[] array) {
        return Arrays.stream(array)
                .average()
                .getAsDouble();
    }

}

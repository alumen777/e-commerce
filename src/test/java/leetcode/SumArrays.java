package leetcode;

import java.util.Arrays;
//https://www.codewars.com/kata/53dc54212259ed3d4f00071c/train/java
//Input: [1, 5.2, 4, 0, -1]
//Output: 9.2
//
//Input: []
//Output: 0
//
//Input: [-2.398]
//Output: -2.398
//Write a function that takes an array of numbers and returns the sum of the numbers.
// The numbers can be negative or non-integer. If the array does not contain any numbers then you should return 0.

public class SumArrays {
    public static void main(String[] args) {
        System.out.println(sum(new double[]{1, 5.2, 4, 0, -1}));
        System.out.println(sumWithStream(new double[]{1, 5.2, 4, 0, -1}));
        System.out.println(sumWithStream2(new double[]{1, 5.2, 4, 0, -1}));

    }

    public static double sum(double[] numbers) {
        if (numbers.length == 0) {
            return 0;
        }
        double sum = 0.00;
        for (double n : numbers) {
            sum += n;
        }
        return sum;
    }

    public static double sumWithStream(double[] numbers) {
        return Arrays.stream(numbers)
                .reduce(0, (Double::sum));
    }

    public static double sumWithStream2(double[] numbers) {
        return Arrays.stream(numbers)
                .sum();
    }

}

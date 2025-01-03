package leetcode;

import java.util.stream.IntStream;
import java.util.Arrays;

public class HowGoodAreYou {
    //https://www.codewars.com/kata/5601409514fc93442500010b/train/java
    public static void main(String[] args) {
        int[] arr = {100, 40, 34, 57, 29, 72, 57, 88};
        int yourAver = 75;
        System.out.println(betterThanAverage(arr, yourAver));
        System.out.println(betterThanAverageWithStream(arr, yourAver));
        System.out.println(betterThanAverageWithStream2(arr, yourAver));

    }

    public static boolean betterThanAverage(int[] classPoints, int yourPoints) {
        int average = 0;
        for (int av : classPoints) {
            average += av;
        }
        return yourPoints > average / classPoints.length;
    }

    public static boolean betterThanAverageWithStream(int[] classPoints, int yourPoints) {
        double aver = IntStream.of(classPoints).average().orElse(0.0);
        return yourPoints > aver;
    }


    public static boolean betterThanAverageWithStream2(int[] classPoints, int yourPoints) {
        double average = Arrays.stream(classPoints).average().getAsDouble();
        return yourPoints > average;
    }
}

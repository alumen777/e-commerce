package leetcode;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {
    public static void main(String[] args) {
    /*    Given an integer array nums, return an array answer such that answer[i] is equal to the product
     of all the elements of nums except nums[i].

The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
        */

        int[] nums = {1, 2, 3, 4};
        System.out.println(Arrays.toString(productOfArrayExceptSelf(nums)));

    }

    public static int[] productOfArrayExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        Arrays.fill(result, 1);

        int prefix = 1, post = 1;
        for (int i = 0; i < nums.length; i++) {
            result[i] = prefix;
            prefix = nums[i] * prefix;
        }

        for (int i = nums.length - 1; i >= 0; i--) {
            result[i] = result[i] * post;
            post = post * nums[i];
        }
        return result;
    }
}



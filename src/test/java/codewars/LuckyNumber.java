package codewars;

public class LuckyNumber {
    /*Write a function to find if a number is lucky or not. If the sum of all digits is 0 or multiple of 9 then the number is lucky.

1892376 => 1+8+9+2+3+7+6 = 36. 36 is divisible by 9, hence number is lucky.

Function will return true for lucky numbers and false for others.*/

    public static void main(String[] args) {
    long l = 1892376l;
        System.out.println(isLucky(l));
    }

    public static boolean isLucky(long n) {
        long sum = 0;
        while(n != 0){
            sum += n % 10;
            n/= 10;
        }
        return sum == 0 || sum % 9 ==0;
    }
}
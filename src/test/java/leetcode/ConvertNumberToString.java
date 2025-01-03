package leetcode;

public class ConvertNumberToString {
    public static void main(String[] args) {
        int number = 123;
        System.out.println(numberToString(number));
    }
    public static String numberToString(int num) {
       // return String.valueOf(num);
        return Integer.toString(num);
    }
}

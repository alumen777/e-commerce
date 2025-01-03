package leetcode;

public class RemoveTailingZeros {
    public static void main(String[] args) {
        int n = 960000;
        System.out.println(noBoringZeros(n));
    }
    public static int noBoringZeros(int n) {
        if (n == 0) return 0;
        int result = n;
        while (result % 10 == 0){
            result /= 10;
        }
        return result;
    }
}

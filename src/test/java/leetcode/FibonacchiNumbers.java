package leetcode;

public class FibonacchiNumbers {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(solve(n));

    }

    public static String solve(int n){
        if(n == 0){
            return "0";
        }
        if(n == 1){
            return "01";
        }
       return solve(n - 1)+ "" + solve(n - 2);
    }
}

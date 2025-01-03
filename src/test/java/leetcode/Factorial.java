package leetcode;

public class Factorial {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(factorial(n));
        System.out.println(factorialSimple(n));

    }
    public static long factorial(int n) {
        long  product = 1;
       for (int i = 1; i <= n ; i++){
         product *= i ;
     }
        return product;
    }

    public static long factorialSimple(int n ){
        if (n > 0){
            return n * factorial(n -1 );
        }
        return 1L;
    }
}

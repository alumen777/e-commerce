package files;

public class PrimeNumber {
    public static void main(String[] args) {
        int number = 7;
        System.out.println(checkIsPrime(number));

    }

    public static boolean checkIsPrime(int n) {
        if (n <= 1) { // prime number starts from 2
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}

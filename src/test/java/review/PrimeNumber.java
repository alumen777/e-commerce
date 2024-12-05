package review;

public class PrimeNumber {

    public static void main(String[] args) {
        int number = 7;
        System.out.println(isNumberPrime(number));

    }
    public static boolean isNumberPrime(int number){
        if (number < 2){
            return false;
        }
        for(int i = 2; i < Math.sqrt(number); i ++){
            if (number % 2 == 0 ){
                return false;
            }
        }
        return true;
    }
}

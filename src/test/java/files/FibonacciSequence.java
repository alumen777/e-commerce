package files;

public class FibonacciSequence {
    public static void main(String[] args) {

        for(int i = 0; i <= 10; i++){
            System.out.println(fibonacci(i));
        }
    }

    public static  int fibonacci (int numb){
        if (numb <= 1){
            return numb;
        }
      return   fibonacci(numb -1) + fibonacci(numb -2);
    }
}

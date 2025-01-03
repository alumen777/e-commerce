package codewars;

public class ReturnMInMAXFromString {
    public static void main(String[] args) {
        String str = "1 2 3 4 5";
        System.out.println(highAndLow( str));
    }
    public static String highAndLow(String numbers) {
        // Code here or
       String [] numbersArr  = numbers.split(" ");
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (String num : numbersArr){
            int currentNumber = Integer.parseInt(num);
            if(max < currentNumber){
                max = currentNumber;
            }
            if(min > currentNumber ){
                min = currentNumber;
            }
        }
        return max + " " + min;

    }
}

package leetcode;

public class LuckyNumber {
    public static void main(String[] args) {
        Long number = 12348L;
        System.out.println(isLucky(number));
        System.out.println(isLuckyNumber(number));
    }

    public static boolean isLucky(Long number){
         int sumOfNumbers = String.valueOf(number).chars()
                .map(Character:: getNumericValue)
                 .sum();
     return sumOfNumbers % 9 ==0 || sumOfNumbers == 0;
    }

    public static boolean isLuckyNumber(Long number ){
        int sum = 0;
        while (number > 0){
         sum += number % 10;
           number/= 10;
        }
      return sum % 9 == 0 || sum == 0;
    }

    public static boolean isLuckyShort(Long number){
        return number % 9 == 0;
    }

}

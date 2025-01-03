package leetcode;

public class CreatePhoneNumber {
    //https://www.codewars.com/kata/525f50e3b73515a6db000b83/train/java
    //createPhoneNumber(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}) // => returns "(123) 456-7890
    public static void main(String[] args) {
        System.out.println(createPhoneNumber(new int []{1, 2, 3, 4, 5, 6, 7, 8, 9, 0}));
        System.out.println(createPhoneNumber2(new int []{1, 2, 3, 4, 5, 6, 7, 8, 9, 0}));

    }
    public static String createPhoneNumber(int[] numbers) {
        String result ="(";
        for (int i = 0; i < numbers.length; i++){
            if(i < 3){
                result = result+ numbers[i] ;
                if(i == 2) {
                    result = result + ") ";
                }
            }
             if(i >2 && i < 6){
                 result = result + numbers[i];
                 if(i == 5){
                     result = result + "-";
                 }
             }
            if (i >= 6){
                result = result + numbers[i];
            }
        }
        return result;
    }
    public static String createPhoneNumber2(int[] numbers){
        String str = "(xxx) xxx-xxxx";
        for(int n : numbers){
            str.replaceFirst("x", Integer.toString(n));
        }
        return str;
    }

}

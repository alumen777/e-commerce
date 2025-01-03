package leetcode;

public class ConvertStringIntoNumber {
    public static void main(String[] args) {
        String str = "1234";
        System.out.println(stringToNumber(str));
    }
    public static int stringToNumber(String str) {
        //TODO: Convert str into a number
        return Integer.valueOf(str).intValue();
       // return Integer.parseInt(str);

    }
}

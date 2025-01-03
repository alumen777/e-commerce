package leetcode;

public class StringRepeat {
    public static void main(String[] args) {
        final int repeat = 5;
        final String string = "Hello";
        System.out.println(repeatStr(repeat,string));
        System.out.println(repeatStrShort(repeat,string));
    }
    public static String repeatStr(final int repeat, final String string) {
       String result = "";
       for(int i = 1; i <= repeat; i ++){
           result +="" + string ;
       }
        return  result;
    }


    public static String repeatStrShort(final int repeat, final String string){
         return string.repeat(repeat);
    }
}

package leetcode;

public class DoubbleChar {
    public static void main(String[] args) {
        String  str = "hello";
        System.out.println(returnDoubleChar(str));
    }
    public static String returnDoubleChar (String str ){
        String result ="";
        for(int i = 0; i < str.length(); i++){
            result += str.charAt(i) +""+ str.charAt(i);
        }
        return result;
    }
}

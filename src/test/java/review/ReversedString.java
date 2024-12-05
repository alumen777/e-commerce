package review;

public class ReversedString {
    public static void main(String[] args) {
        String str  = "My name is";
        System.out.println(reverseString(str));
        System.out.println(reverseStringWithLoop(str));
    }
     public static String reverseString (String str){
        StringBuilder sb = new StringBuilder(str);
       return sb.reverse().toString();
     }

     public static String reverseStringWithLoop(String str){
        String reversed = "";
        for(int i = str.length() - 1; i >= 0; i --){
            reversed += str.charAt(i);
         }
        return reversed;
     }
}

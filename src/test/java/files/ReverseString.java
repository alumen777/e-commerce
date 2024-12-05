package files;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseString {
    public static void main(String[] args) {
        String text = "I love java, but not today";
      //  System.out.println(reverseString(text));
        System.out.println(forLoopReverse(text));


        List<String> names = new ArrayList<>();
        names.add("Peter");
        names.add("Leo");
        names.add("Ben");

        System.out.println(reverseListOfStrings(names));
    //with stream

        names.stream()
                .sorted((s1, s2) -> s2.compareTo(s1))
                .toList();
    }
    //
    public static String reverseString (String str){
        StringBuilder  sb = new StringBuilder(str);
        return sb.reverse().toString();
    }
// for loop
    public static String forLoopReverse(String text){
        String reverted = "";
        for(int i = text.length() -1; i >= 0; i--) {
            reverted = reverted + text.charAt(i) ;
        }
        return reverted ;
    }

    // collections

    public static List<String> reverseListOfStrings(List list ){
        List <String > reversed = new ArrayList<>();
        Collections.reverse(list);
        return reversed;
    }


}

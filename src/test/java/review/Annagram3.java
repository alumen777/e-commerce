package review;

import java.util.Arrays;

public class Annagram3 {
    public static void main(String[] args) {
        String str1 ="i love Java";
        String str2 = "i love java";
        System.out.println(ifAnagram(str1,str2));
    }
    public static boolean ifAnagram(String str1, String str2) {
        if (str1.length() == str2.length()) {
            char[] ch = str1.toLowerCase().toCharArray();
            char[] ch1 = str2.toLowerCase().toCharArray();
            Arrays.sort(ch);
            Arrays.sort(ch1);
            return Arrays.equals(ch, ch1);
        }
        return false;
    }
}

package review;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String str1 = "Java";
        String str2 = "JAav";
        System.out.println(isAnagram(str1, str2));
    }


    public static boolean isAnagram(String str1, String str2) {
        if (str1.length() == str2.length()) {
            char[] ch1 = str1.toLowerCase().toCharArray();
            char[] ch2 = str2.toLowerCase().toCharArray();
            Arrays.sort(ch1);
            Arrays.sort(ch2);
            return Arrays.equals(ch1, ch2);
        }
        return false;
    }
}
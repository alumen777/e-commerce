package files;

import java.util.Arrays;

public class AnagramSecond {

    public static void main(String[] args) {
        String str1 = "Java";
        String str2 = "aavj";
        System.out.println(isAnagramOrNot(str1, str2));

    }

    public static boolean isAnagramOrNot(String str1, String str2) {
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
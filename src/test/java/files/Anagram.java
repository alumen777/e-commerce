package files;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String str1 = "Java";
        String str2 = "aavj";

        System.out.println(checkIfAnagram(str1,str2));
    }

    public static boolean checkIfAnagram(String str1, String str2){
        if (str1 == null || str2 == null) {
            throw new NullPointerException("Input strings cannot be null");
        }

        if (str1.length() == str2.length()) {
            char[] ch1 = str1.toLowerCase().toCharArray();
            char[] ch2 = str2.toLowerCase().toCharArray();
            Arrays.sort(ch1);
            Arrays.sort(ch2);


            return Arrays.equals(ch1,ch2);  //ch1.toString().equals(ch2.toString());
        } else {
            return false;
        }
    }
}

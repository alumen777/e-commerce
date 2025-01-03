package files;

public class Palindrome {
    public static void main(String[] args) {
      String name = "madama";
        System.out.println(isPalindrome(name));
    }

    public static boolean isPalindrome(String str){
        String reverted = "";
        for(int i = str.length() - 1; i >= 0; i--){
            reverted += str.charAt(i);
        }
        return str.equals(reverted);
    }
}

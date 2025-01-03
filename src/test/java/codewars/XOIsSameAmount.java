package codewars;

public class XOIsSameAmount {
    public static void main(String[] args) {
     String str = "xooxx";
        System.out.println(getXO(str));
    }

    public static boolean getXO (String str) {
       str = str.toLowerCase();

     return str.replaceAll("o", "").length() == str.replaceAll("x", "").length();
    }
}

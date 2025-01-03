package leetcode;

public class abbrevName {
    public static void main(String[] args) {
        String name = "Jame Hogan";
        System.out.println(returnInitials(name));
    }

    public static  String returnInitials(String name){
       String[] arr = name.split(" ");
       return arr[0].charAt(0) + "." + arr[1].charAt(0);
    }
}

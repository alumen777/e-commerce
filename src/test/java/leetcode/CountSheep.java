package leetcode;

public class CountSheep {
    // https://www.codewars.com/kata/5b077ebdaf15be5c7f000077/train/java
    //output : 1 sheep...2 sheep...3 sheep...
    public static void main(String[] args) {
        int num = 10;
        System.out.println(countingSheep(num));
    }

    public static String countingSheep(int num) {
        String returned = "";
        for (int i = 1; i <= num; i++) {
            returned += i + " sheep ... ";
        }
        return returned;
    }
}

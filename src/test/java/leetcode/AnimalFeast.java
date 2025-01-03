package leetcode;

public class AnimalFeast {
    public static void main(String[] args) {
        String beast = "great blue heron";
        String dish = "garlic naan";
        System.out.println(feast(beast, dish));

    }
    public static boolean feast(String beast, String dish) {
        return beast.charAt(0) == dish.charAt(0) && beast.charAt(beast.length() -1) == dish.charAt(dish.length() -1);
    }

}

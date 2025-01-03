package leetcode;
import java.util.Arrays;
//https://www.codewars.com/kata/58acfe4ae0201e1708000075/train/java
//Simple Fun #152: Invite More Women?
// -1 woman
// 1 man
// true if he needs to invite more women
// assertEquals(false, Kata.inviteMoreWomen(new int[] {-1, -1, -1}));
public class SimpleFun {
    public static void main(String[] args) {
        System.out.println(inviteMoreWomen(new int []{-1, -1, -1}));
        System.out.println(inviteMoreWomenWithLoop(new int[]{-1, -1, -1}));

    }
    public static boolean inviteMoreWomen(int[] l) {
        return Arrays.stream(l)
                .sum() > 0;
    }
    public static boolean inviteMoreWomenWithLoop(int[] l){
        int sum = 0;
        for(int men : l){
            sum += men;
        }
        return sum > 0 ? true : false;

    }
}

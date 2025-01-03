package leetcode;
import java.util.ArrayList;

public class NumberOfPeopleInBus {
    //https://www.codewars.com/kata/5648b12ce68d9daa6b000099/train/java
    //  public void test1() {
    //    ArrayList<int[]> list = new ArrayList<int[]>();
    //    list.add(new int[] {10,0});
    //    list.add(new int[] {3,5});
    //    list.add(new int[] {2,5});
    //    assertEquals(5, metro.countPassengers(list));

    public static void main(String[] args) {
        ArrayList<int[]> list = new ArrayList<int[]>();
        list.add(new int[] {10,0});
        list.add(new int[] {3,5});
        list.add(new int[] {2,5});
        System.out.println(countPassengers(list));

        System.out.println(countPassengersWithStream(list));
    }


    public static int countPassengers(ArrayList<int[]> stops) {
        int temp =0;
        for(int[] c : stops){
          temp += c[0] - c[1];
        }
         return temp;
    }
   //with stream
   public static int countPassengersWithStream(ArrayList<int[]> stops) {

   return stops.stream()
           .mapToInt(x -> x[0] - x[1])
           .sum();
   }
}

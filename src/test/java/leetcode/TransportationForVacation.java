package leetcode;

public class TransportationForVacation {
    //https://www.codewars.com/kata/568d0dd208ee69389d000016/train/java
    public static void main(String[] args) {
        int days = 5;
        System.out.println(rentalCarCost(days));

    }
    public static int rentalCarCost(int d) {
        int total = 0;
        if(d < 3){
            total = 40 * d;
        } else if  (d > 2 && d < 7 ){
            total = 40 * d - 20;
        } else {
           total =   40 * d - 50;
        }
        return total;
    }
    public static int rentalCarCost2(int d){
        return d >=7 ? d*40 -50 : d >= 3 ? d * 40 -20 : d * 40;
    }

}

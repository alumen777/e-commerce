package files;

public class LeapYear {
    public static void main(String[] args) {
        // divisible by 4, 100 and 400 - leap year
        // not divisible by 100 only
        // not divisible 400
        int year = 1974;
    }


    public static boolean isLeapYear(int num) {
       /* if(num % 400 == 0){
            return true;
        }
        if(num % 4 ==0 && num % 100 != 0){
            return true;
        }*/
        if ((num % 400 == 0) || (num % 4 == 0 && num % 100 != 0)) {
            return true;
        }
        return false;
    }
}

package leetcode;

public class ChromosomeCheck {
    public static void main(String[] args) {
     String sperm = "XY";
        System.out.println(chromosomeCheck(sperm));
    }
    public static String chromosomeCheck(String sperm) {
        // Your code goes here. Have fun!
       /* if(sperm.contains("Y")){
            return "Congratulations! You're going to have a son.";
        }
         return "Congratulations! You're going to have a daughter";*/
      //  return sperm.contains("Y") ? "Congratulations! You're going to have a son.": "Congratulations! You're going to have a daughter";
        return sperm.equals("XY") ? "Congratulations! You're going to have a son." : "Congratulations! You're going to have a daughter.";
    }
}

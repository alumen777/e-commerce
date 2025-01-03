package files;

public class CheckForVowels {

    public static void main(String[] args) {
        String str = "I love java";
        System.out.println(checkIfVowelPresent(str));
    }

    public static boolean checkIfVowelPresent(String str){
       return str.toLowerCase().replaceAll("[^aouiey]","").length() > 0;
    }

    public static boolean checkForVowelsSwitchCase(String str){
        for(char c : str.toLowerCase().toCharArray()){

          switch(c){
              case 'a':
              case 'o':
              case 'e':
              case 'i':
              case 'y':
              case 'u':
                  return true;
          }
        }
        return false;
    }


}

package codewars;

public class returnDoubleCharacter {
    public static void main(String[] args) {
        String str = "Hello World";
        System.out.println(doubleChar(str));
    }
    public static String doubleChar(String s) {
        String result ="";
        for(char c: s.toCharArray()){
            result += c +"" + c;
        }
        return result;
    }
    }


package codewars;

public class AbbreviateName {
    public static void main(String[] args) {
        String name = "patrick feeney";
        System.out.println(abbrevName(name));
    }

        public static String abbrevName(String name) {
            //name.toUpperCase();
            for (int i = 0; i < name.length(); i++) {
                if (name.charAt(i) == ' ') {
                    name = name.charAt(0) + "." + name.charAt(i + 1) +".";
                    break;
                }
            }
                return name.toUpperCase();



        }
    }

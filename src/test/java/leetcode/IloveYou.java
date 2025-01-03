package leetcode;

public class IloveYou {
    public static void main(String[] args) {
        //https://www.codewars.com/kata/57f24e6a18e9fad8eb000296/train/java
        System.out.println(howMuchILoveYou(6));

    }
    public static String howMuchILoveYou(int nb_petals) {

                switch (nb_petals % 6) {
                    case 1:
                        return "I love you";
                    case 2:
                        return "a little";
                    case 3:
                        return "a lot";
                    case 4:
                        return "passionately";
                    case 5:
                        return "madly";
                    default:
                        return "not at all";
                }
            }
    }




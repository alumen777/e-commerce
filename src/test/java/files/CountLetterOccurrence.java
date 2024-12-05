package files;

import java.util.HashMap;
import java.util.Map;

public class CountLetterOccurrence {
    public static void main(String[] args) {
        String s = "Hello java";
       countOccurrence(s);

    }

    public static void countOccurrence(String str){
        Map<Character, Integer> occurrence = new HashMap<>();
        char [] chars = str.toCharArray();

        for(char c : chars ){
            if (occurrence.containsKey(c)){
                occurrence.put(c, occurrence.get(c) +1);
            } else {
                occurrence.put(c,1);
            }
        }
        for( Map.Entry entry : occurrence.entrySet()){
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }
}

package review;

import java.util.HashMap;
import java.util.Map;

public class LetterOccurence {
    public static void main(String[] args) {

    }

    public static void letterOcurrence(String str) {
        Map<Character, Integer> map = new HashMap();
        for (Character c : str.toCharArray()) {
            if (!map.containsKey(c)) {
                map.put(c, 1);
            } else {
                map.put(c, map.get(c) + 1);
            }
        }
       for(Map.Entry entry : map.entrySet()){
           System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }
}
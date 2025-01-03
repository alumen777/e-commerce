package leetcode;

import java.util.HashMap;
import java.util.Map;

public class letterOccurance {
    public static void main(String[] args) {
        String str = "I love Java";
        findOccurence(str);
    }

    public static void findOccurence (String str){
        Map<Character, Integer> map = new HashMap<>();
        char [] ch = str.toCharArray();
        for(char m : ch ){
            if(!map.containsKey(m)){
                map.put(m, 1);
            } else {
                map.put(m, map.get(m ) + 1 );
            }

        }
        for( Map.Entry entry : map.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }

}

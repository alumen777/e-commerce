package files;

import java.util.HashMap;
import java.util.Map;

public class HashMapContry {
    public static void main(String[] args) {
        Map<String, String > contriesMap = new HashMap<>();
        contriesMap.put("USA","Washington");
        contriesMap.put("Canada","Ottawa");
        contriesMap.put("France","Paris");
        contriesMap.put("China","Beijing");
        contriesMap.put("Japan","Tokyo");

    }

    public static void updatedListWithNewHashMap(Map <String, String>map){
        Map<String, String> updatedMap = new HashMap<>();
        for(String country : map.keySet()){
           if(!country.startsWith("C")){
               updatedMap.put(country, map.get(country));
           }
        }
        for(Map.Entry entry : updatedMap.entrySet()){
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
        // print with foreach
        updatedMap.forEach((key, value) -> System.out.println(key + "" + value));

        // print with sout
        System.out.println(updatedMap);



    }
}

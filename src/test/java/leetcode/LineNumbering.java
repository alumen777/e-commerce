package leetcode;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class LineNumbering {
    public static void main(String[] args) {
        //https://www.codewars.com/kata/54bf85e3d5b56c7a05000cf9/train/java
        List<String> lines = Arrays.asList("a", "b", "c");
        System.out.println(number(lines));
        System.out.println(number(Arrays.asList("", "", "", "", "")));

    }

    public static List<String> number(List<String> lines) {
        List<String> list = new ArrayList<>();
        int index = 1;
        for (String l : lines) {
            list.add(index + ": " + l);
            index++;
        }
        return list;
    }


}

package leetcode;
import java.util.Arrays;

//https://www.codewars.com/kata/57cc975ed542d3148f00015b/train/java
public class YouOnlyNeedOne {
    // @Test
    //    public void testSomething() {
    //        assertEquals(Solution.check(new Object[] {66, 101}, 66), true);
    //        assertEquals(Solution.check(new Object[] {80, 117, 115, 104, 45, 85, 112, 115}, 45), true);
    //        assertEquals(Solution.check(new Object[] {'t', 'e', 's', 't'}, 'e'), true);
    //        assertEquals(Solution.check(new Object[] {"what", "a", "great", "kata"}, "kat"), false);
    public static void main(String[] args) {
        System.out.println(check(new Object[]{80, 117, 115, 104, 45, 85, 112, 115}, 45));
        System.out.println(checkWithCollections(new Object[]{80, 117, 115, 104, 45, 85, 112, 115}, 45));
        System.out.println(checkWithStream(new Object[]{80, 117, 115, 104, 45, 85, 112, 115}, 45));
        System.out.println(checkWithStream2(new Object[]{80, 117, 115, 104, 45, 85, 112, 115}, 45));

    }

    public static boolean check(Object[] a, Object x) {
        for (Object c : a) {
            if (c.equals(x)) {
                return true;
            }
        }
        return false;
    }
    public static boolean checkWithCollections(Object[] a, Object x) {
        return Arrays.asList(a).contains(x);
    }

    public static boolean checkWithStream(Object[] a, Object x) {
        return Arrays.stream(a).anyMatch(object -> x.equals(object));

    }
    public static boolean checkWithStream2(Object[] a, Object x) {
        return Arrays.stream(a).anyMatch(x::equals);

    }
}

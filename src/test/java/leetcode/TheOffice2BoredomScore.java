package leetcode;
import java.util.Map;

public class TheOffice2BoredomScore {
    public static void main(String[] args) {
        Person[] staff = new Person[] {
                new Person("tim", "change"),
                new Person("jim", "accounts"),
                new Person("randy", "canteen"),
                new Person("sandy", "change"),
                new Person("andy", "change"),
                new Person("katie", "IS"),
                new Person("laura", "change"),
                new Person("saajid", "IS"),
                new Person("alex", "trading"),
                new Person("john", "accounts"),
                new Person("mr", "finance")
        };

        String result = boredom(staff);
        System.out.println(result);
    }

    public static String boredom(Person[] staff) {
        Map<String,Integer> map = Map.of(
                "accounts", 1,
                "finance", 2,
                "canteen", 10,
                "regulation", 3,
                "trading", 6,
                "change", 6,
                "IS", 8,
                "retail", 5,
                "cleaning", 4,
                "pissing about", 25
        );
        int sum = 0;
        for (Person person : staff) {
            sum += map.getOrDefault(person.department, 0);
        }
        return sum <= 80 ? "kill me now" : sum < 100 && sum > 80 ? "i can handle this" : "party time!!";
    }

    public static class Person {
        public String name;
        public String department;

        public Person(String name, String department) {
            this.name = name;
            this.department = department;
        }
    }
}

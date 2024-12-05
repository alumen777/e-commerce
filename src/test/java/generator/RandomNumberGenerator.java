package generator;

import java.util.Random;

public class RandomNumberGenerator {
    public static void main(String[] args) {
        String[] options = {" Anagram","Fibonacci"};
        Random random = new Random();
        int randomIndex = random.nextInt(options.length);
        String randomOption = options[randomIndex];
        System.out.println(" Selected option: " + randomOption);
    }
}

package leetcode;

public class MakeArithmeticFunction {
    //https://www.codewars.com/kata/583f158ea20cfcbeb400000a/train/java
    public static void main(String[] args) {
        System.out.println(arithmetic(1, 2, "add"));
        System.out.println(arithmetic(5, 2, "subtract"));
        System.out.println(arithmetic(5, 2, "multiply"));
        System.out.println(arithmetic(5, 2, "divide"));

    }

    public static int arithmetic(int a, int b, String operator) {
        switch (operator) {
            case "add":
                return a + b;
            case "subtract":
                return a - b;
            case "multiply":
                return a * b;
            case "divide":
                if (b == 0) {
                    throw new ArithmeticException("Cannot divide by zero!");
                }
                return a / b;
            default:
                return 0;
        }
    }
}

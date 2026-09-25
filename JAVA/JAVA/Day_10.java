public class Day_10 {
    public static void main(String[] args) {
        // day 10 nested if statements
        int num = 1000;

        // Outer if-else separating negative numbers from zero and positive numbers
        if (num < 0) {
            System.out.println("This is a negative number");
        } else {
            // Nested block handles 0, small positives, and large positives
            if (num == 0) {
                System.out.println("The number is zero");
            } else if (num <= 100) {
                System.out.println("This is a small positive");
            } else {
                System.out.println("This is a large number!");
            }
        }
    }
}
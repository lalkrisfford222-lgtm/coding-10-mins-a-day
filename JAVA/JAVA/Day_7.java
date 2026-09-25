import java.util.Scanner;

public class Day_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.println("Where are you from?");
        String country = scanner.nextLine();

        System.out.println("How old are you?");
        int age = scanner.nextInt();

        System.out.println("You are from: " + country +
                " and you are " + age + " years old.");

    }
}
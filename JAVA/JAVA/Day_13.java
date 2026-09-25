import java.util.Scanner;

public class Day_13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int num = 0;

        do {
            System.out.println("Enter a number: ");
            num = scanner.nextInt();
        }while(num < 0);
    }
}
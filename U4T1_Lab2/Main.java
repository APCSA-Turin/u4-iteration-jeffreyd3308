import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What number do you want to factorial? ");
        System.out.print("Enter a number between 0 and 170: ");
        int userNumber = scanner.nextInt();
        double answer = 1.0;
        
        while (userNumber <= 0 || userNumber > 170) {
            System.out.print("No! Between 0 and 170: ");
            userNumber = scanner.nextInt();
        }

        for (int i = 1; i <= userNumber; i++) {
            answer *= i;
        }

        System.out.println(userNumber + "! is " + answer);
    }
}

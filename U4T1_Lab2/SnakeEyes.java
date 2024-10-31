import java.util.Scanner;

public class SnakeEyes {
    public static void main(String[] args) {
        int rolls = 1;
        int firstRoll = (int) (Math.random() * 6) + 1;
        int secondRoll = (int) (Math.random() * 6) + 1;
        while (firstRoll != 1 || secondRoll != 1) {
            System.out.println("Roll #" + rolls + " " + firstRoll + " and " + secondRoll);
            System.out.println("Not snake eyes, rolling again!");
            firstRoll = (int) (Math.random() * 6) + 1;
            secondRoll = (int) (Math.random() * 6) + 1;
            rolls++;
        }

        System.out.println("Roll #" + rolls + " " + firstRoll + " and " + secondRoll);
        System.out.println("Finally, snake eyes!");
    }
}

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Main{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to My Number Guessing Game! ");
        System.out.print("Enter a number: ");
        int max_num = input.nextInt();

        int random_num = ThreadLocalRandom.current().nextInt(0, max_num + 1);
        int count = 0;
        int attempt = 0;
        System.out.println("--You'll have a maximum number of 3 guesses in total--");

        while(true){
            count += 1;
            attempt += 1;
            System.out.print("make a guess between 0 to " + max_num + " (Attempt: " + attempt + "): ");
            int guess = input.nextInt();

            if (guess == random_num){
                System.out.println("you've got it correct in " + count + " guesses! ");
                break;    
            } else if (count >= 3) {
                System.out.println("Game over! ");
                break;
            } else if (guess > max_num){
                System.out.println("*Enter a number below than " + max_num + "*");
                count = 0;
                attempt = 0;
            } else {
                System.out.println("you've got it incorrect:/ ");
            }
        }
    }
}

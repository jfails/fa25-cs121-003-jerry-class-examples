import java.util.Scanner;
import java.util.Random;

public class ChooseNumber 
{
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        Random rGen = new Random();
        int randomNumber = rGen.nextInt(5) + 1;

        System.out.print("Guess a number between 1 and 5: ");
        int userGuess = keyboard.nextInt();

        boolean done = false;

        while (!done)
        {
            // if the answer is guessed correctly
            if (randomNumber == userGuess)
            {
                System.out.println("You guessed my number!");
                done = true;
            }
            else if (randomNumber > userGuess) // what happens if guess too low
            {
                System.out.println("You guessed too low!");
            }
            else // what happens if guess too high
            {
                System.out.println("You guessed too high!");    
            }
            
            if (!done) // check to see if done so don't reprint request for input
            {
                System.out.print("Guess a number between 1 and 5: ");
                userGuess = keyboard.nextInt();            
            }
        }

        System.out.println("My number was " + randomNumber);

        keyboard.close();
    }    
}

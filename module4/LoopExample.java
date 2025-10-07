import java.util.Scanner;

/**
 * Shows how to do some things with loops and characters.
 * @author Jerry Fails
 */
public class LoopExample {


    public static void main(String[] args) {
    
        // EXAMPLE of sentinel value

        // Scanner keyboard = new Scanner(System.in);
        // System.out.print("Choose an option, q to quit: ");
        // char c = keyboard.nextLine().charAt(0);
        // while (!(c == 'q' || c == 'Q'))
        // {
        //     System.out.print("Choose an option, q to quit: ");
        //     c = keyboard.nextLine().charAt(0);
        // }
        // // always remember to close your Scanner
        // keyboard.close();

        // EXAMPLE: loop to show characters (and simple character math)
        // setting up variables
        char c = '\u1E0B'; //keyboard.nextLine().charAt(0);
        while (c < 10000)
        {
            System.out.print(c + " ");
            c++;
        }

    }
    
}

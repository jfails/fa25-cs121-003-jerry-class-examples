import java.util.Scanner;

/**
 * Shows how to do some things with loops and characters
 */
public class LoopExample {


    public static void main(String[] args) {
    
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Choose an option, q to quit: ");
        char c = '\u1E0B'; //keyboard.nextLine().charAt(0);

        // while (!(c == 'q' || c == 'Q'))
        // {
        //     System.out.print("Choose an option, q to quit: ");
        //     c = keyboard.nextLine().charAt(0);
        // }

        while (c < 10000)
        {
            System.out.print(c + " ");
            c++;
        }

        keyboard.close();
    }
    
}

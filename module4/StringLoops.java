import java.util.Scanner;

/**
 * Some loops playing with Strings ...
 * @author Jerry Fails
 */
public class StringLoops 
{
    public static void main(String[] args) 
    {
        // setting up a scanner to the keyboard
        Scanner keyboard = new Scanner(System.in);
        
        // getting user input
        System.out.print("Tell me your secret: ");
        String secret = keyboard.nextLine();

        // printing out secret backwards
        for (int i = secret.length()-1; i >= 0; i--)
        {
            System.out.print(secret.charAt(i));
        }

        keyboard.close();
    }    
}

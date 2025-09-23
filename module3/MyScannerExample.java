import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class MyScannerExample {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Tell me your name: ");
        String name = keyboard.nextLine();

        // System.out.print("How old are you: ");
        // int age = keyboard.nextInt();

        System.out.print("How much money do have: ");
        float accountBalance = keyboard.nextFloat();

        NumberFormat nf = NumberFormat.getCurrencyInstance();

        // System.out.println("Nice to meet you, " + name + " at " + age + " you are so young!");
        System.out.println("Nice to meet you, " + name + ". With " + nf.format(accountBalance) + " you have a lot of money!");

        keyboard.close();
    }
}

import java.util.ArrayList;
import java.awt.Color;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;

public class ArrayListExample 
{
    public static void main(String[] args) {
        ArrayList<Color> colors = new ArrayList<Color>();

        Random r = new Random();

        for (int i = 0; i < 10 + r.nextInt(11); i++)
        {
            colors.add(new Color(r.nextInt(256), 
                r.nextInt(256), r.nextInt(256)));
        }

        // for loop to print out all of the items (including their index)
        for (int i = 0; i < colors.size(); i++)
        {
            System.out.println(i + ": " + colors.get(i));
        }

        // for-each loop to show all items
        for (Color c: colors)
        {
            System.out.println(c);
        }
    }    
}

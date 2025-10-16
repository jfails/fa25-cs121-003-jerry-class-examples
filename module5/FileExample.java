import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

public class FileExample {
    public static void main(String[] args) {
        // a file to read from
        File f = new File("data.txt");

        try
        {
            Scanner fileScan = new Scanner(f);
            ArrayList<Integer> nums = new ArrayList<Integer>();

            // while there is still something in the file
            while (fileScan.hasNextLine())
            {
                String line = fileScan.nextLine();          // get the next line
                Scanner lineScanner = new Scanner(line);    // setup a scanner to read from it
                lineScanner.useDelimiter(",");              // setup the delimiter (to read commas)
                while (lineScanner.hasNext())               // while there is something in the line
                {
                    nums.add(Integer.parseInt(lineScanner.next()));
                    //System.out.print(lineScanner.next() + ";"); // get the next part
                }
                System.out.println();
                lineScanner.close();                        // clean up and close the line scanner
            }
            fileScan.close();                               // clean up and close the file scanner


            // print out all of the numbers in my collection
            for (Integer num : nums)
            {
                System.out.print(num + " ");
            }
        }
        catch (FileNotFoundException fnfe)
        {
            System.out.println("File not found!");
            fnfe.printStackTrace();
        }


        
    }
}

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileExample {
    public static void main(String[] args) {
        
        File f = new File("data.txt");

        try
        {
            Scanner fileScan = new Scanner(f);

            while (fileScan.hasNextLine())
            {
                String line = fileScan.nextLine();
                Scanner lineScanner = new Scanner(line);
                lineScanner.useDelimiter(",");
                while (lineScanner.hasNext())
                {
                    System.out.println(lineScanner.next());
                }
                lineScanner.close();
            }
            fileScan.close();
        }
        catch (FileNotFoundException fnfe)
        {
            System.out.println("File not found!");
            fnfe.printStackTrace();
        }
    }
}

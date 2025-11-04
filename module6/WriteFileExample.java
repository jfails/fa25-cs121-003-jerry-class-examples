import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class WriteFileExample {
    
    public static void main(String[] args) {
        
        try
        {
            PrintWriter fileWriter = new PrintWriter(new FileOutputStream("myfile.txt", false));
            
            fileWriter.println("Hello write file!");

            fileWriter.close();
        }
        catch (FileNotFoundException fnfe)
        {
            System.out.println("ERROR: file not found!");
        }

    }
}

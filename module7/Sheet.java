import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

/**
 * Represents a single spread sheet of integer number values.
 * @author Jerry Fails
 */
public class Sheet {
    // FIELDS
    private int[][] nums;

    // CONSTRUCTOR
    /**
     * Creates a sheet read from a file.
     * @param filename
     */
    public Sheet(String filename)
    {
        try
        {
            // to scan my file
            Scanner fileScanner = new Scanner(new File(filename));

            // read data size from file
            Scanner lineScanner = new Scanner(fileScanner.nextLine());
            int rows = Integer.parseInt(lineScanner.next());
            int cols = Integer.parseInt(lineScanner.next());

            // create/instantiate the array of numbers with the size read from file
            this.nums = new int[rows][cols];

            // read in all the rows
            for (int i = 0; i < nums.length; i++)
            {
                // read info from file
                String[] strNums = fileScanner.nextLine().split(" ");

                // parse all values and store them
                for (int j = 0; j < nums[i].length; j++)
                {
                    nums[i][j] = Integer.parseInt(strNums[j]);
                }
            }

            fileScanner.close();
        }
        catch (FileNotFoundException fnfe)
        {
            System.out.println("ERROR: no file!");
        }
    }

    /**
     * Creates a sheet that merges the two passed sheets
     * @param sheet1 the first sheet to merge
     * @param sheet2 the second sheet to merge
     */
    public Sheet(Sheet sheet1, Sheet sheet2)
    {
        this.nums = new int[sheet1.numRows()+sheet2.numRows()][Math.max(sheet1.numCols(), sheet2.numCols())];

        // add the first sheet
        for (int rows = 0; rows < sheet1.numRows(); rows++)
        {
            for (int cols = 0; cols < sheet1.numCols(); cols++)
            {
                this.nums[rows][cols] = sheet1.nums[rows][cols];
            }
        }

        // add the second sheet
        for (int rows = 0; rows < sheet2.numRows(); rows++)
        {
            for (int cols = 0; cols < sheet2.numCols(); cols++)
            {
                this.nums[rows+sheet1.numRows()][cols] = sheet2.nums[rows][cols];
            }
        }

    }

    // METHODS
    /**
     * Returns the number of rows in this sheet
     * @return the number of rows in this sheet
     */
    public int numRows()
    {
        return nums.length;
    }

    /**
     * Returns the number of columns in this sheet
     * @return the number of columns in this sheet
     */
    public int numCols()
    {
        if (nums != null)
        {
            return nums[0].length;
        }
        else return 0;
    }

    /**
     * Returns a string representation of a sheet.
     */
    public String toString()
    {
        String str = "Sheet:\n";
        str += nums.length + " " + nums[0].length + "\n";
        for (int rows = 0; rows < nums.length; rows++)
        {
            for (int cols = 0; cols < nums[0].length; cols++)
            {
                str += nums[rows][cols] + " ";
            }
            str += "\n";
        }
        return str;
    }
}

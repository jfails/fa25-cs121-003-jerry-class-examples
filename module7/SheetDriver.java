/**
 * This is used to test Sheet (creation and merge).
 * @author Jerry Fails
 */
public class SheetDriver {
    public static void main(String[] args) {
        if (args.length != 2)
        {
            System.out.println("USAGE: java SheetDriver <file1> <file2>");
            System.exit(-1);
        }

        Sheet sheet1 = new Sheet(args[0]);
        Sheet sheet2 = new Sheet(args[1]);
        Sheet merged = new Sheet(sheet1, sheet2);
        System.out.println(merged);
        System.out.print("\"" + '\0' + "\"");
    }
}

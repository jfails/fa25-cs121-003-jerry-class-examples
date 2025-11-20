public class CommandLine {
    public static void main(String[] args) {
        
        if (args.length != 2)
        {
            System.out.println("USAGE: CommandLine <string> <# times to repeat>");
            System.exit(1);
        }

        // Example of printing out any number of args
        // System.out.println("Num args is: " + args.length);

        // for (String s : args)
        // {
        //     System.out.println(s);
        // }


        for (int i = 0; i < Integer.parseInt(args[1]); i++)
        {
            System.out.println(args[0]);
        }
    }
}

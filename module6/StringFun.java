import java.util.ArrayList;

public class StringFun {
    
    public static void main(String[] args) {
        

        ArrayList<String> strings = new ArrayList<String>();

        for (int i = 0; i < 100; i++)
        {
            strings.add("" + i + " " + i*i);
        }

        if (strings.contains("12 144"))
        {
            System.out.println("Has the value");
        }
        else
        {
            System.out.println("Nope!");
        }

        System.out.println(strings.size());
        
    }
}

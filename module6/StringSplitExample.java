public class StringSplitExample {
    public static void main(String[] args) {
        String str = "CS121 is the best class ever!";
        String[] splitStr = str.split(" ");

        for (String s : splitStr)
        {
            System.out.print(s);
        }
    }
}

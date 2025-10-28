public class DiceDriver {
    public static void main(String[] args) {
        PairOfDice pd = new PairOfDice();
        System.out.println(pd);
        
        for (int i = 0; i < 10; i++)
        {
            System.out.println(pd.roll());
            System.out.println(pd);
        }
    }
}

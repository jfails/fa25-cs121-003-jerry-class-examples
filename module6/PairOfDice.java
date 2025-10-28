public class PairOfDice implements Rollable
{
    // FIELDS
    private Die die1;
    private Die die2;

    // CONSTRUCTORS
    public PairOfDice()
    {
        this.die1 = new Die();
        this.die2 = new Die();
    }    

    // METHODS
    public String toString()
    {
        return "PairOfDice: " + die1.getFaceValue() + " " + die2.getFaceValue();
    }

    @Override
    public int roll() {
        return die1.roll() + die2.roll();
    }

}

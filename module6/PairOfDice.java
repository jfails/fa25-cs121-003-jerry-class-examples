/**
 * Represents a pair of dice
 * @author Jerry Fails
 */
public class PairOfDice implements Rollable
{
    // FIELDS
    private Die die1;
    private Die die2;

    // CONSTRUCTORS
    /**
     * Creates and sets up a pair of dice using the default constructors for each die object.
     */
    public PairOfDice()
    {
        this.die1 = new Die();
        this.die2 = new Die();
    }

    /**
     * Creates a pair of dice with the specified number of sides
     * @param numSides the number of sides each die will have
     */
    public PairOfDice(int numSides)
    {
        this.die1 = new Die(numSides);
        this.die2 = new Die(numSides);
    }

    // METHODS

    /**
     * Returns the total of the face values of the dice
     * @return the total of the face values of the dice
     */
    public int getTotalFaceValue()
    {
        return die1.getFaceValue() + die2.getFaceValue();
    }

    public Die getDie1()
    {
        return die1;
    }

    public String toString()
    {
        return "PairOfDice: " + die1.getFaceValue() + " " + die2.getFaceValue();
    }

    @Override
    public int roll() {
        return die1.roll() + die2.roll();
    }

}

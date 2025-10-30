import java.util.Random;

/**
 * A Die class that represents a multi-faced die and it's current face value.
 * @author Jerry Fails
 */
public class Die implements Rollable, Comparable<Die>
{
    // STATIC VARIABLE
    private static int numDice = 0;
    
    // FIELDS
    private int id;
    private int numSides;
    private int faceValue;
    private Random randomGen;

    // CONSTRUCTORS
    /**
     * Default constructor sets the number of sides to 6, and randomly sets the face value.
     */
    public Die() 
    { 
        numDice++;
        this.id = numDice;
        this.numSides = 6;
        this.randomGen = new Random();
        this.roll();
    }

    /**
     * Constructor to create a mult-sided die
     * @param numSides the number of sides this die will have
     */
    public Die(int numSides)
    {
        numDice++;
        this.id = numDice;
        this.numSides = numSides;
        this.randomGen = new Random();
        this.roll();
    }

    // METHODS
    public int getFaceValue()
    {
        return faceValue;
    }


    /**
     * Rolls the die and returns the value.
     * @return the new value after being rolled
     */
    public int roll()
    {
        faceValue = randomGen.nextInt(numSides) + 1;
        return faceValue;
    }

    public String toString()
    {
        return "Die[" + id+ ","+ numSides + "]: " + faceValue;
    }

    public static void main(String[] args) 
    {
        Die die1 = new Die();
        Die die2 = new Die(13);
        

        for (int i = 0; i < 10; i++)
        {
            die1.roll();
            die2.roll();
            System.out.print("die1: " + die1 + "\t");
            System.out.println("die2: " + die2);
        }
    }

    @Override
    public int compareTo(Die arg0) {
        return faceValue - arg0.getFaceValue();
    }    
}

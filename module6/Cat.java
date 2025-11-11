import java.util.Random;

/**
 * Represents a cat
 * @author Jerry Fails
 */
public class Cat implements AnimalInterface 
{
    // FIELDS
    private String name;
    private int age;

    // CONSTRUCTORS
    /**
     * Creates a new cat with the specified name (that was just born).
     * @param name name of the cat
     */
    public Cat(String name)
    {
        this.name = name;
        this.age = 0;
    }

    /** 
     * @param name
     */
    // METHODS

    @Override
    public void setName(String name) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setName'");
    }

    /** 
     * @return String
     */
    @Override
    public String getName() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getName'");
    }

    /** 
     * @return int
     */
    @Override
    public int getAge() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAge'");
    }

    @Override
    public void makeSound() {
        Random r = new Random();
        if (r.nextBoolean())
        {
            System.out.println("Purr");
        }
        else
        {
            System.out.println("Meow");
        }
    }

    @Override
    public void eat() {
        System.out.println("I'm full!");
    }
    
}

/**
 * For loop examples ...
 * @author Jerry Fails
 */
public class ForExample 
{
    private static int number;

    public static void main(String[] args) 
    {
        // calculate the even sum 10 to 100
        int evenSum = 0;
        for (int i = 10; i <= 100; i += 2)
        {
            evenSum += i;
        }

        System.out.println("Even sum is: " + evenSum);


        // calculate the odd sum 10 to 100
        int oddSum = 0;
        for (int i = 11; i <= 100; i += 2)
        {
            oddSum += i;
        }

        System.out.println("Odd sum is: " + oddSum);


        // calculate the even and odd sums 10 to 100
        evenSum = 0;
        oddSum = 0;
        for (int i = 10; i <= 100; i++)
        {
            // check for even, add to evenSum, otherwise add to oddSum
            if (i % 2 == 0)
                evenSum += i;
            else oddSum += i;
        }
        
        // printing out the results
        System.out.println("Even sum is: " + evenSum);
        System.out.println("Odd sum is: " + oddSum);
    }
}
